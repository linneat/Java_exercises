public class IntervalTest
{
  public static void main(String[] args)
  {
    Interval myInterval = new Interval(1.0, 4.0);
    Interval b = new Interval(2.0, 9.0);
    boolean isXinInterval = myInterval.contains(0.0);
    boolean intersectionOfTwoIntervals = myInterval.intersects(b);
    String printInterval = myInterval.toString();
    System.out.println(isXinInterval);
    System.out.println(printInterval);
    System.out.println(intersectionOfTwoIntervals);
  }
}