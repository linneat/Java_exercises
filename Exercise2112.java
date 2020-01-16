public class Exercise2112  {
  public static int signum(int n) {
    int result = 0;
    if (n < 0) {
      result = -1;
    }
    else if (n == 0) {
      result = 0;
    }
    else {
      result = 1;
    }
    return result;
  }

  public static void main(String[] args) {
    int n = 9;
    int returnValue = signum(n);

    System.out.println(returnValue);
  }
}
