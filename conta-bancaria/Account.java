public class Account {
  
  public Account(String name, String cpf){
    this.name = name;
    this.cpf = cpf;
  }

  private String cpf;
  private String name;
  private double balance;
  
  public String getCpf() {
    return this.cpf;
  }
  
  public String getName() {
    return this.name;
  }

  public double getBalance() {
    return this.balance;
  }

  public double getFee(){
    return 0.05;
  }

  public void deposit(double value){
    this.balance += value;
  }

  public void withdraw(double value){
    if((value + (this.balance * this.getFee()) > this.balance)){
      System.out.print("Saldo insuficiente\n");
      return;
    }
    this.balance -= value + (this.balance * this.getFee());
  }
}
