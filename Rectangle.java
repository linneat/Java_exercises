public class Rectangle 
{
  private final double x;
  private final double y;

  private final double width;
  private final double height;

  public Rectangle(double x0, double y0, double w, double h)
  {
    x = x0;
    y = y0;
    width = w;
    height = h;
  }

  public double area()
  {
    return width * height;
  }

  public double perimeter()
  {
    return 2 * width + 2 * height;
  }

  public boolean intersects(Rectangle b)
  {
    double leftX = Math.max(x - 0.5 * width, b.x - 0.5 * b.width);
    double rightX = Math.min(x + 0.5 * width, b.x + 0.5 * b.width);
    double topY = Math.min(y + 0.5 * height, b.y + 0.5 * b.height);
    double botY = Math.max(y - 0.5 * height, b.y - 0.5 * b.height);
 
    if ((rightX > leftX) && (botY < topY))
    {
      return true;
    }
    return false;
  }

  public boolean contains(Rectangle b)
  {
    double aXLeft = x - 0.5 * width;
    double bXLeft = b.x - 0.5 * b.width;
    double aXRight = x + 0.5 * width;
    double bXRight = b.x + 0.5 * b.width;
    double aYBot = y - 0.5 * height;
    double bYBot = b.y - 0.5 * b.height;
    double aYTop = y + 0.5 * height;
    double bYTop = b.y + 0.5 * b.height;

    if ((aXLeft < bXLeft) && (aXRight > bXRight) && (aYBot < bYBot) && (aYTop > bYTop))
    {
      return true;
    }
    return false;
  }
}