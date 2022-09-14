public class Time {

    Time(String team, Cidade cidade){
        this.nome = team;
        this.cidade = cidade;
    }

    private String nome;
    private Cidade cidade;

    // cidade
    public Cidade getCidade() {
        return cidade;
    }

    // nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }    
}
