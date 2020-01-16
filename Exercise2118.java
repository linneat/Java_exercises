import java.util.Arrays;

public class Exercise2118  {

  public static void betweenZeroAndOne(double[] a) {
    double maxValue = a[0];
    double minValue = a[0];
    for (int i = 0; i < a.length; i++) {
      if (a[i] > maxValue) {
        maxValue = a[i];
      }
      if (a[i] < minValue) {
        minValue = a[i];
      }
    }
    for (int i = 0; i < a.length; i++){
      a[i] = (a[i] - minValue)/(maxValue-minValue);
    }
    System.out.println("max: " + maxValue);
    System.out.println("min: " + minValue);
  }

  public static void main(String[] args) {
    double[] x = {2.2, 1.1, 4.4, 2.6};
    betweenZeroAndOne(x);

    System.out.println(java.util.Arrays.toString(x));
  }
}
