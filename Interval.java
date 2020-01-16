public class Interval {
  // Declaring variables
  double myleft;
  double myright;


  // Making constructor
  public Interval(double left, double right)
  {
    this.myleft = left;
    this.myright = right;
  }

  // instance method
  public boolean contains(double x) {
    if ((x > this.myleft) && (x < this.myright))
    {
      return true;
    }
    return false;
  }


  public boolean intersects(Interval b) {
    if ((b.myleft > myleft) && (b.myleft < myright))
    {
      return true;
    }
    else if ((b.myright < myright) && b.myright > myleft)
    {
      return true;
    }
    return false;
  }

  public boolean intersects2(Interval b) {
    if (contains(b.myleft) || contains(b.myright))
    {
      return true;
    }
    return false;  
  }

  public String toString()
  {
    return "Interval: " + this.myleft + " - " + this.myright;
  }

}
