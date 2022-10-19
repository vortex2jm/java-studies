package biblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Acervo {

    private Map<Integer, Livro> acervo = new HashMap<>();

    public void insereLivro(Livro livro){
        this.acervo.put(livro.getId(), livro);
    }

    public Livro removeLivro(int key){
        return this.acervo.remove(key);
    }

    public Collection<Livro> getLivros(){
        return new ArrayList<Livro>(this.acervo.values());
    }
}
