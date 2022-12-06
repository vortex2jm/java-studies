import domain.Blastoise;
import domain.Pikachu;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pikachu pk = new Pikachu();
        Blastoise bls = new Blastoise();

        System.out.println("Vitalidade do Pikachu: " + pk.getPontosVitalidade());
        System.out.println("Vitalidade do Blastoise: " + bls.getPontosVitalidade());

        System.out.println("Pikachu ataca Blastoise");
        pk.atacar(bls);

        System.out.println("Vitalidade de Blastoise após ataque de Pikachu: " + bls.getPontosVitalidade());

        bls.regenera();
        System.out.println("Blastoise regenerou. Vitalidade: "+ bls.getPontosVitalidade());
    }
}
