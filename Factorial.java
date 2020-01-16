public class Factorial
{
  public static int fac(int n)
  {
    if (n == 1)
    {
      return 1;
    }
    else {
      return n * fac(n - 1);
    }
  }



  public static void main(String[] args)
   {
    int n = Integer.parseInt(args[0]);
    int facNr = fac(n);
    System.out.println(facNr);
   }

}