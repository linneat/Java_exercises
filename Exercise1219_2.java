public class Exercise1219_2
{
  public static void main(String[] args)
   {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int max = Math.max(a,b);
    int min = Math.min(a,b);
    int distance = max - min
    double random = Math.random() * distance + min;
    System.out.println(random);
   

}