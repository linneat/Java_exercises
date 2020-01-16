public class Exercise1413
{       
  public static void main(String[] args)
  {
    int[][] a = {
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12},
      {13, 14, 15, 16}  
    };
    int row = 0;
    int column = 1;
    int t = 0;
    while (row < a.length)
    {
      while (column < a.length)
      {
        //swapping the numbers
        t = a[row][column];
        a[row][column] = a[column][row];
        a[column][row] = t;
        column = column + 1;
      }
      row = row + 1;
      column = row + 1;
    }

    for (int i = 0; i < a.length; i++)
    {
      System.out.println(java.util.Arrays.toString(a[i]));
    }

  }
}