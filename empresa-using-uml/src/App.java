public class App {
    public static void main(String[] args){
        
        Sala sala1 = new Sala(1, 3);
        
        Funcionario func1 = new Funcionario("Jaozim", 23);
        Funcionario func2 = new Funcionario("Henrique", 22);

        sala1.addFuncionario(func1);
        sala1.addFuncionario(func2);

        System.out.println(func1.getSala());
        System.out.println(func2.getSala());
        System.out.println(sala1.getFuncionarios());
    }
}
