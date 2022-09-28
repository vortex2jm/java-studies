public class Retangulo extends Forma{
    
    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    private double largura;
    private double altura;

    @Override
    public double getArea(){
        return largura * altura;
    }

    @Override
    public double getPerimetro(){
        return ((largura * 2) + (altura * 2));
    }

    @Override
    public String toString(){
        return "Retângulo";
    }
}
