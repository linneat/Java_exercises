public class Exercise1314
{
  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);
    int i = 1;
    double result = 1;

    if (n > 0)
    {
      while(result <= n)
      {
        System.out.println(result);
        result = Math.pow(2,i);
        i = i + 1;
        
      }
    }
  }   
}