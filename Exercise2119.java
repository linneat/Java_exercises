import java.util.Arrays;

public class Exercise2119  {

  public static int countOfI(int[] a, int v) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (v==a[i]){
        count = count + 1;
      }
    }
    return count;
  }
    
  public static void main(String[] args) {
    int M = 5;
    int[] b = new int[M];
    int[] a = {1,3,1,5,7,8};
    for (int i = 0; i < M; i++) {
      b[i] = countOfI(a, i);
    }

    System.out.println(java.util.Arrays.toString(b));
    System.out.println(java.util.Arrays.toString(a));
  }
}
