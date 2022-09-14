public class Uf {
    public Uf(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    private String nome, sigla;
    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
}
