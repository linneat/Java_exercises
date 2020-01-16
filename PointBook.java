public class PointBook
{
  double myX;
  double myY;

  public PointBook(double x, double y)
  {
    this.myX = x;
    this.myY = y;
  }

  public double distanceTo(PointBook q)
  {
    double distranceX = q.myX - myX;
    double distranceY = q.myY - myY;
    double distrance = Math.sqrt(Math.pow(distranceX,2.0) + Math.pow(distranceY, 2.0));
    return distrance;
  }

  public String toString()
  {
    return "The point is: (" + this.myX + "," + this.myY + ").";
  }

}