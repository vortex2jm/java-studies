public class SpecialAccount extends Account{

  public SpecialAccount(String name, String cpf) {
    super(name, cpf);
  }

  @Override
  public double getFee() {
    return 0.01;
  }
}
