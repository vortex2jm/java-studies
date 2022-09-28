public class Circulo extends Forma{
    
    public Circulo(double raio){
        this.raio = raio;
    }

    private double raio;

    @Override
    public double getArea(){
        return ((Math.PI) * (Math.pow(raio, 2)));
    }

    @Override
    public double getPerimetro(){
        return (2 * Math.PI * raio);
    }

    @Override
    public String toString(){
        return "Círculo";
    }
}
