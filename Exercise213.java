public class Exercise213  {
  public static boolean odd(boolean a, boolean b, boolean c) {
    boolean c1 = a && b && c;
    boolean c4 = a && b && !c;
    boolean c6 = a && !b && c;
    boolean c8 = !a && b && c;
    boolean atLeastTwoAreTrue = c1 || c4 || c6 || c8;
    return atLeastTwoAreTrue;
  }

  public static void main(String[] args) {
    boolean a = true;
    boolean b = true;
    boolean c = true;

    System.out.println("are there at least 2 true values? " + odd(a, b, c));
  }
}
