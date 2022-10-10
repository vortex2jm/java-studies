public class Triangle {
  
  public Triangle(Point a, Point b, Point c){
    this.a = a;
    this.b = b;
    this.c= c;
  }

  private Point a;
  private Point b;
  private Point c;
  
  public double getPerimeter(){
    
    double distAB =  Math.sqrt((Math.pow((this.a.getX() - this.b.getX()),2) +
                                Math.pow((this.a.getY() - this.b.getY()),2)));
    double distBC =  Math.sqrt((Math.pow((this.b.getX() - this.c.getX()),2) +
                                Math.pow((this.b.getY() - this.c.getY()),2)));
    double distCA =  Math.sqrt((Math.pow((this.c.getX() - this.a.getX()),2) +
                                Math.pow((this.c.getY() - this.a.getY()),2)));
    return distAB + distBC+ distCA;
  } 
  
}
