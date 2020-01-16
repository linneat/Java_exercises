public class ArrayPointer
{
  public static void main(String[] args)
  {
    int[] suit = {2, 3, 1, 4};
    int[] a = suit;
    a[2] = 99;
    System.out.println(java.util.Arrays.toString(suit));
    System.out.println(java.util.Arrays.toString(a));
    System.out.println(suit);
    System.out.println(a);
  }
}