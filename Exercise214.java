public class Exercise214  {
  public static boolean eq(int[] a, int[] b) {
    boolean answer = true;
    if (a.length == b.length)
    {
      int i = 0;
      while (i < a.length)
      {
        if (a[i] == b[i])
        {
          answer = true;
        }
        else 
        {
          answer = false;
          return answer;
        }
        i = i + 1;
      }
      return answer;
    }
    answer = false;
    return answer;
  }

  public static void main(String[] args) {
    int[] a = {1, 2, 3};
    int[] b = {1, 2, 3};

    boolean comparison = eq(a, b);

    

    System.out.println("Are the two arrays the same length? and do the contain the same intergers? " + comparison);
  }
}
