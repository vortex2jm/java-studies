public class Funcionario {
    
    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    private String nome;
    private String cpf;
    private double salario;
    private int horasSemanais = 40;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public int getHorasSemanais(){
        return horasSemanais;
    }
}
