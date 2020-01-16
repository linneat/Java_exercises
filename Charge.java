public class Charge {
  //Declaring variables
  double myx0;
  double myy0;
  double myq0;


  //Making constructor
  public Charge(double x0, double y0, double q0)
  {
    this.myx0 = x0;
    this.myy0 = y0;
    this.myq0 = q0; 
  }

  //instance method
  public double potentialAt(double x, double y) {
    double r = distanceToPoint(x, y);
    double k = 8.99*Math.pow(10, 9);
    double v = k*this.myq0/r;
    return v;
  }


  private double distanceToPoint(double x, double y) {
    return Math.sqrt(Math.pow((x - this.myx0),2)+Math.pow(y - this.myy0, 2));
  }

  public String toString()
  {
    return "Charge at <" + this.myx0 + ", " + this.myy0 +"> " + "with charge " + this.myq0;
  }

}
