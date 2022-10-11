public class BoardGames extends Product {
  
  public BoardGames(String name, double price, int minimumAge ){
    super(name, price);
    this.minimumAge = minimumAge;
  }

  private int minimumAge;

  public int getMinimumAge() {
    return minimumAge;
  }

  public void setMinimumAge(int minimumAge) {
    this.minimumAge = minimumAge;
  }

  @Override
  public String toString() {
    return super.toString() + ", idade mínima: " + this.minimumAge;
  }
}
