import java.util.ArrayList;
import java.util.Collection;

public class Sala {

    private int numero;
    private int vagasTotais;
    private int vagasOcupadas;
    private ArrayList<Funcionario> funcionarios;

    // construtor
    public Sala(int numero, int vagas) {
        this.vagasTotais = vagas;
        this.numero = numero;
        this.vagasOcupadas = 0;
        this.funcionarios = new ArrayList<>();
    }
    
    // =================================================//
    public int getVagasOcupadas() {
        return vagasOcupadas;
    }

    public void setVagasOcupadas(int vagasOcupadas) {
        this.vagasOcupadas = vagasOcupadas;
    }

    // =================================================//
    public int getVagasTotais() {
        return vagasTotais;
    }
    
    // =================================================//
    public int getNumero() {
        return numero;
    }

    // =================================================//
    public boolean addFuncionario(Funcionario funcionario){

        if(this.vagasOcupadas == this.vagasTotais)
            return false;

        boolean result = this.funcionarios.add(funcionario);
        if(result == true){
            funcionario.setSala(this);
            this.vagasOcupadas ++;
        }
        return result;
    }

    // =================================================//
    public Collection<Funcionario> getFuncionarios(){
        return new ArrayList<Funcionario>(this.funcionarios);  
    }

    @Override
    public String toString() {
        return "sala" + this.numero;
    }
}
