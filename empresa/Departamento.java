import java.util.LinkedList;

public class Departamento {
    
    public Departamento(String nome){
        this.nome = nome;
    }

    private String nome;
    private LinkedList<Funcionario> funcionarios = new LinkedList<Funcionario>();

    // métodos da lista de funcionários
    public LinkedList<Funcionario> getFuncionarios() {
        return new LinkedList<Funcionario>(funcionarios);
    }

    // adiciona um departamento na lista
    public boolean addFuncionario(Funcionario funcionario){
        return this.funcionarios.add(funcionario);
    }

    // remove um funcionario da lista
    public boolean removeFuncionario(Funcionario funcionario){
        return this.funcionarios.remove(funcionario);
    }

    // verifica se esse funcionario existe na empresa
    public boolean existsFuncionario(Funcionario funcionario){
        return this.funcionarios.contains(funcionario);
    }

    // verifica se a lista de funcionarios está vazia
    public boolean isEmpty(){
        return this.funcionarios.isEmpty();
    }

    // retorna o funcionario com o cpf correspondente
    public Funcionario findFuncionarioByCpf(int cpf){

        for(Funcionario f: funcionarios){
            if(f.getCpf() == cpf){
                return f;
            }
        }
        return null;
    }

    // métodos do nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
