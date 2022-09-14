public class Cidade {
    
    public Cidade(String nome, Uf uf){
        this.uf = uf;
        this.nome = nome;
    }

    private String nome;
    private Uf uf;

    public String getNome() {
        return nome;
    }
    public Uf getUf() {
        return uf;
    }
}
