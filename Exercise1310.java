import java.text.DecimalFormat;


public class Exercise1310
{
  private static DecimalFormat df = new DecimalFormat("#.##");

  public static void main(String[] args)
  {
    System.out.printf("N\tlog(N)\tNlog(N)\tN2\tN3\t2N\n" );
    String sep = "\t";
    int n = 16;
    double logN;
    double nLogN;
    int nSquare;
    int nCube;

    while (n <= 2048 ) {
      logN = Math.log(n);
      nLogN = n*logN;
      nSquare = (int)Math.pow(n, 2);
      nCube = (int)Math.pow(n, 3);
      System.out.println(n + sep + df.format(logN) + sep + df.format(nLogN) + sep 
                        + nSquare + sep + nCube);
      n = n + n;
    }
    
  }   
}