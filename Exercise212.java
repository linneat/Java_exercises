public class Exercise212{
  public static boolean odd(boolean a, boolean b, boolean c) {
    // 3 booleans
    // combinations are:
    // all 3 are true => T
    // only 2 are true => F
    // only 1 is true => T
    // none are true => F

    boolean onlyAIsTrue = a && !b && !c;
    boolean onlyBIsTrue = !a && b && !c;
    boolean onlyCIsTrue = !a && !b && c;

    if (a && b && c) {
      return true;
    } else if (onlyAIsTrue || onlyBIsTrue || onlyCIsTrue) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    boolean a = false;
    boolean b = false;
    boolean c = false;

    System.out.println("is there an odd number of true values? " + odd(a, b, c));
  }
}