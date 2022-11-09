public class Funcionario {

    private String nome;
    private int idade;
    private Sala sala;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }    

    public int getIdade() {
        return idade;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public Sala getSala() {
        return sala;
    }

    @Override
    public String toString() {
        return "Funcionario [nome= " + nome + ", idade= " + idade + "]";
    }
}
