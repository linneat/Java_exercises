public class Exercise211 {
  public static int max3(int a, int b, int c) {
    if (a >= b) {
      if (a >= c) return a;
      else return c ;
    } else {
      if (b >= c) return b;
      else return c;
    }
  }

  public static double max3(double a, double b, double c) {
    if (a >= b) {
      if (a >= c) return a;
      else return c ;
    } else {
      if (b >= c) return b;
      else return c;
    }
  }

  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    double d = Double.parseDouble(args[3]);
    double e = Double.parseDouble(args[4]);
    double f = Double.parseDouble(args[5]);

    int maxValueInt = max3(a, b, c);
    double maxValueDouble = max3(d, e, f);

    System.out.println("the max int value is: " + maxValueInt);
    System.out.println("the max double value is: " + maxValueDouble);
  }
}