package interfaces;

public interface PersonagemDeLuta<T> {
  public boolean atacar(T personagemAtacado);
	public void regenera();
	public int getPontosVitalidade();
}
