public class Exercise148
{
  public static void main(String[] args)
  {
    int n = 10;
    int[] a = new int[n];
    a[0] = 1;
    a[1] = 1;

    System.out.println(java.util.Arrays.toString(a));

    for (int i = 2; i < n; i++){
        a[i] = a[i - 1] + a[i - 2];
    }
    System.out.println(java.util.Arrays.toString(a));     
  }
}