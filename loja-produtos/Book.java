public class Book extends Product {
  
  public Book(String name, double price, String author){
    super(name, price);
    this.author = author;
  }
  
  private String author;

  public String getAuthor() {
    return this.author;
  }

  @Override
  public String toString() { 
    return super.toString() + ", autor: " + this.author;
  }
}
