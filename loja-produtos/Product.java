public abstract class Product{

  public Product(String name, double price){
    this.name = name;
    this.price = price;
  }

  private String name;
  private double price;
  
  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "nome: "+this.name+", preço: R$"+this.price;
  }
}
