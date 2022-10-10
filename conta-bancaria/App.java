public class App{
  public static void main( String[] args){
    
    Account acc1 = new Account("João Moura", "12345678910");
    System.out.println(acc1.getFee());
    System.out.println(acc1.getBalance());  
    acc1.deposit(35.90);
    acc1.withdraw(20.00);
    System.out.println(acc1.getBalance());

    SpecialAccount sAcc = new SpecialAccount("Caio", "9876543210");
    System.out.println(sAcc.getFee());
    System.out.println(sAcc.getBalance());
    sAcc.deposit(35.90);
    sAcc.withdraw(36.00);
    System.out.println(sAcc.getBalance());
  }
}
