public class TrianguloEquilatero extends Forma {
    
    public TrianguloEquilatero(double tamanhoDoLado){
        this.tamanhoDoLado = tamanhoDoLado;
    }

    private double tamanhoDoLado;

    @Override
    public double getArea(){
        return ((Math.pow(tamanhoDoLado, 2)) * (Math.sqrt(3)/4));
    }

    @Override
    public double getPerimetro(){
        return (tamanhoDoLado*3);
    }

    @Override
    public String toString(){
        return "Triângulo Equilátero";
    }   
}
