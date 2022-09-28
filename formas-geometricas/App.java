import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args){

        List<Forma> formas = new LinkedList<>();

        formas.add(new Circulo(4));
        formas.add(new Retangulo(3.5, 2));
        formas.add(new TrianguloEquilatero(10));

        DecimalFormat formatadorDecimal = new DecimalFormat("0.00");

        for(Forma f: formas){
            System.out.println("O perímetro do " + f + " é igua a " + formatadorDecimal.format(f.getPerimetro()));
            System.out.println("A área do " + f + " é igua a " + formatadorDecimal.format(f.getArea()) + "\n");
        }
    }
}
