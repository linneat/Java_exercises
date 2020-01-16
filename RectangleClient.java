public class RectangleClient
{
  public static void main(String[] args)
  {
    Rectangle a = new Rectangle(2.0, 2.0, 1.0, 2.0);
    Rectangle b = new Rectangle(2.0, 2.0, 2.0, 4.0);
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