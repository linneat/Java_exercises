public class PointTest
{
  public static void main(String[] args)
  {
    PointBook a = new PointBook(1.0, 2.0);
    PointBook q = new PointBook(2.0, 4.0);
    double distance = a.distanceTo(q);


    System.out.println(a.toString());
    System.out.println(q.toString());
    System.out.println("The distance is: " + distance);
  }
}