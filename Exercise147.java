public class Exercise147
{
  public static void main(String[] args)
  {
    int[] a = new int[10];
    System.out.println(java.util.Arrays.toString(a));
    for (int i = 0; i < 10; i++){
        a[i] = 9 - i;
    }
    System.out.println(java.util.Arrays.toString(a));
    for (int i = 0; i < 10; i++){
        a[i] = a[a[i]];
    }
    System.out.println(java.util.Arrays.toString(a));
    for (int i = 0; i < 10; i++){
        System.out.println(a[i]);
    }         
  }
}

