public class Exercise1220
{
  public static void main(String[] args)
   {
    double a = Math.random() * 1.0;
    double b = Math.random() * 6.0;
    double sum = a + b;
    long round = Math.round(sum);
    System.out.println(sum);
    System.out.println(round);
}
   
}