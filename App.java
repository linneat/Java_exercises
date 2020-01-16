public class App {
  public static boolean allInFirstQuadrant(int[][] points) {
    for(int i = 0; i < points.length; i++) {
      int[] currentPoint = points[i];
      int x = currentPoint[0];
      int y = currentPoint[1];

      if (x < 0 || y < 0)
        return false;
    }

    return true;
  }

  public static void main(String[] args) {
    int[] p1 = {1, 2};
    int[] p2 = {3, 1};
    int[] p3 = {4, 2};

    int[][] points = {p1, p2, p3};

    System.out.println("are all points in the first quadrant? " + allInFirstQuadrant(points));
  }
}
