public class Exercise2110  {
  public static double lg(double n, double x) {
    double lgOfx = Math.log(x);
    double lgOfn = Math.log(n);
    double result = lgOfn/lgOfx;
    return result;
  }

  public static void main(String[] args) {
    double x = 2;
    double n = 9;
    double resultOfSecondLogOfn = lg(n,x);

    System.out.println("The result of the second logerithm of n is " + resultOfSecondLogOfn);
  }
}
