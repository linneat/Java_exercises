import java.util.Scanner;

public class Exercise2117 
{
  public static boolean[][] readBoolean2D() 
  {
    Scanner input = new Scanner(System.in);
    
    // Getting Int input
    System.out.print("Enter nr of rows: ");
    int myRows = input.nextInt();
    System.out.println("rows entered = " + myRows);

    System.out.print("Enter nr of columns: ");
    int myColumns = input.nextInt();
    System.out.println("columns entered = " + myColumns);

    input.close();

    int M = myRows;
    int N = myColumns;
    boolean[][] a = new boolean[M][N];
    for (int i = 0; i < M; i++)
    {
      for (int j = 0; j < N; j++)
      {
        System.out.print("Enter item in row " + i + " and column " + j + ": " );
        a[i][j] = input.nextBoolean();
      }
    }
    return a;
  }

  public static void main(String[] args)
  {
    boolean[][] callmethod = readBoolean2D();
    System.out.println(java.util.Arrays.deepToString(callmethod));

  }
}