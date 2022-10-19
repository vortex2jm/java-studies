package biblioteca;

public class Livro {
    public Livro(String titulo, String autor, int anoPubli, int id){
        this.id = id;
        this.anoPubli = anoPubli;
        this.autor = autor;
        this.titulo = titulo;
    }

    private String autor, titulo;
    private int id, anoPubli;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoPubli() {
        return anoPubli;
    }
    
    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString(){
        return this.titulo;        
    }    
}
