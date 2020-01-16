public class Exercise1411
{
  public static void main(String[] args)
  {
    // for rectangular case (i is rows and j i columns):
    int[][] a = {{1, 2, 3, 4},{5, 6, 7, 8}};
    int[][] b = new int[a.length][a[0].length];

    for (int i = 0; i < a.length; i++)
    {
      for (int j = 0; j < a[i].length; j++)
      {
        b[i][j] = a[i][j];
        System.out.println(b[i][j]);
      }
    }
    //System.out.println(java.util.Arrays.toString(b));
  }
}