package domain.abs;

import java.util.Random;

import interfaces.PersonagemDeLuta;

public abstract class Pokemon implements PersonagemDeLuta<Pokemon> {

  private int maxVitality;
  private int minDamage;
  private int maxDamage;
  private int currentVitality;

  //Constructor===============================================//
  public Pokemon(int vitality, int minDamage, int maxDamage) {
    this.maxVitality = vitality;
    this.minDamage = minDamage;
    this.maxDamage = maxDamage;
    this.currentVitality = vitality;
  }

  //Setters===================================//
  public void setCurrentVitality(int damage) {
    this.currentVitality -= damage;
  }

  //Override========================================//
  @Override
  public boolean atacar(Pokemon personagemAtacado) {
    
    // ataque
    Random r = new Random();
    if(r.nextBoolean())
      personagemAtacado.setCurrentVitality(this.maxDamage);
    else
      personagemAtacado.setCurrentVitality(this.minDamage);

    // 0 pontos de vitalidade
    if(personagemAtacado.getPontosVitalidade() <= 0)
      return true;

    return false;
  }

  @Override
  public void regenera() {
    this.currentVitality = this.maxVitality;      
  }

  @Override
  public int getPontosVitalidade() {
    return this.currentVitality;
  }
  
}
