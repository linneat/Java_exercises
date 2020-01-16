public class Exercise1412
{
  public static void main(String[] args)
  {
    int[][] a = {{99, 98, 92, 94, 99, 90, 76, 92, 97, 89},{85, 57, 77, 32, 34, 46, 59, 66, 71, 29},{98, 78, 76, 11, 22, 54, 88, 89, 24, 38}};
    for (int i = 0; i < 3; i++)
    {
      for (int j = 0; j < 10; j++)
      {
        System.out.print(a[i][j] + " ");
      }
      System.out.println(" ");
    }
    System.out.println(" ");
    
    //Switching rows and columns
    for (int j = 0; j < 10; j++)
    {
      for (int i = 0; i < 3; i++)
      {
        System.out.print(a[i][j] + " ");
      }
      System.out.println(" ");
    }    
  }
}