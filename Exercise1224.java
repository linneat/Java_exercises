public class Exercise1224
{
  public static void main(String[] args)
   {
    double t = Double.parseDouble(args[0]);
    double p = Double.parseDouble(args[1]);
    double r = Double.parseDouble(args[2]);
    System.out.println(p*Math.exp(r*t));
}
   
}