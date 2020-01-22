public class RootsClient 
{
  public static void main(String[] args)
  {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);
    Roots root1 = new Roots(a, b, c);
    Complex xx1 = root1.rootX1();
    Complex xx2 = root1.rootX2();
    System.out.println("x1 = " + xx1.toString());
    System.out.println("x2 = " + xx2.toString());
  }
}