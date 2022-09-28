public class FuncionarioTempoParcial extends Funcionario {
    
    public FuncionarioTempoParcial(String nome, String cpf, double salario, int horasSemanais){
        super(nome, cpf, salario);
        this.horasSemanais = horasSemanais;
    }

    private int horasSemanais;

    @Override
    public int getHorasSemanais(){
        return this.horasSemanais;
    }
}
