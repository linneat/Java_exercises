public class Rectangle2 
{
  private final double x1;
  private final double y1;
  private final double x2;
  private final double y2;


  public Rectangle2(double x11, double y11, double x22, double y22)
  {
    this.x1 = x11;
    this.y1 = y11;  
    this.x2 = x22;
    this.y2 = y22;
  }


  private double width()
  {
    double width = this.x2 - this.x1;
    return width;
  }

  private double height()
  {
    double height = this.y2 - this.y1;
    return height;
  }


  public double area()
  {
    return width() * height();
  }

  public double perimeter()
  {
    return 2 * width() + 2 * height();
  }

  public boolean intersects(Rectangle2 b)
  {
    double leftX = Math.max(x1, b.x1);
    double rightX = Math.min(x1 + width(), b.x1 + b.width());
    double topY = Math.min(y1 + height(), b.y1 + b.height());
    double botY = Math.max(y1, b.y1);
 
  if ((rightX > leftX) && (botY < topY))
  {
    return true;
  }
    return false;
  }

  public boolean contains(Rectangle2 b)
  {
  double aXLeft = x1;
  double bXLeft = b.x1;
  double aXRight = x1 + width();
  double bXRight = b.x1 + b.width();
  double aYBot = y1;
  double bYBot = b.y1;
  double aYTop = y1 + height();
  double bYTop = b.y1 + b.height();

  if ((aXLeft < bXLeft) && (aXRight > bXRight) && (aYBot < bYBot) && (aYTop > bYTop))
  {
    return true;
  }
    return false;
  }
}