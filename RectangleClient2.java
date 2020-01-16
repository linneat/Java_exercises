public class RectangleClient2
{
  public static void main(String[] args)
  {
    Rectangle2 a = new Rectangle2(1.0, 1.0, 4.0, 3.0);
    Rectangle2 b = new Rectangle2(2.0, 2.0, 5.0, 5.0);
    double aArea = a.area();
    double aPerimeter = a.perimeter();
    boolean aIntersectsWb = a.intersects(b);
    boolean aContainsb = a.contains(b);
    System.out.println(aArea);
    System.out.println(aPerimeter);
    System.out.println(aIntersectsWb);
    System.out.println(aContainsb);

  }
}