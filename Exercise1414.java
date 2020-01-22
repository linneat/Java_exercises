public class Exercise1414
{
  public static void main(String[] args)
  {
    int n = 5;
  // int n = Integer.parseInt(args[0]);
  boolean[][] matrixBoolean = new boolean[n][n];
  //nr of true values in the matrix:
  int nrOfTrueValues = n/2;

  while (nrOfTrueValues > 0)
  {
    int min = 0;
    int max = n-1; 
    int k = min + (int)(Math.random() * ((max - min) + 1));
    int l = min + (int)(Math.random() * ((max - min) + 1));
    if (matrixBoolean[k][l] == false)
    {
      matrixBoolean[k][l] = true;
    }
    nrOfTrueValues = nrOfTrueValues - 1;
  }

    for (int row = 0; row < matrixBoolean.length; row = row + 1)
    {
      System.out.println(java.util.Arrays.toString(matrixBoolean[row]));
      
    }
  }
}




