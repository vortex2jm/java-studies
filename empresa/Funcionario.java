public class Funcionario {
    
    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    private String nome;
    private int cpf;
    private double salario;
    
    public int getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }
}
