public class Exercise1222
{
  public static void main(String[] args)
   {
    double x0 = Double.parseDouble(args[0]);
    double v0 = Double.parseDouble(args[1]);
    double t = Double.parseDouble(args[2]);
    double result = x0+v0*t+9.78003*Math.pow(t, 2.0)/2;
    System.out.println(result);
}
   
}