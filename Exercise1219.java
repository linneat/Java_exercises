public class Exercise1219
{
  public static void main(String[] args)
   {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int max = LinneaMath.max(a,b);
    int min = LinneaMath.min(a,b);
    double random = LinneaMath.random() * max;
    while (random < min) {
      random = LinneaMath.random() * max;
    }
    System.out.println(random);
   }

}