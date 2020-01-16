public class Exercise139
{
  public static void main(String[] args)
  {
    int n = Integer.parseInt(args[0]);
    double x = 0;
    int count = 1;
    double total = 0;

    while (count <= n ) {
      
      x = Math.random();
      // System.out.println(x);
      count = count + 1;
      total = total + x;
      // System.out.println(total);
    }
    System.out.println(total/n);
  }   
}