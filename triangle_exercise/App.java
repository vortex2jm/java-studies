public class App {
  
  public static void main( String[] args ){
    
    Point a = new Point(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
    Point b = new Point(Double.parseDouble(args[2]), Double.parseDouble(args[3]));
    Point c = new Point(Double.parseDouble(args[4]), Double.parseDouble(args[5]));

    Triangle tri = new Triangle(a,b,c); 
    
    System.out.println(tri.getPerimeter());
  }
}
