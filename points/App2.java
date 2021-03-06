package points;

public class App2 {
  public static boolean allInFirstQuadrant(Point[] points) {
    for(int i = 0; i < points.length; i++) {

      Point currentPoint = points[i];

      int x = currentPoint.getX();
      int y = currentPoint.getY();

      if (x < 0 || y < 0)
        return false;
    }

    return true;
  }

  public static void main(String[] args) {
    Point p1 = new Point(1, 2);
    Point p2 = new Point(3, 1);
    Point p3 = new Point(-4, 2);

    Point[] points = {p1, p2, p3};

    System.out.println("are all points in the first quadrant? " + allInFirstQuadrant(points));
  }
}
