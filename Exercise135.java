public class Exercise135
{
  public static void main(String[] args)
   {
    double t = Double.parseDouble(args[0]);
    double v = Double.parseDouble(args[1]);
    double w = 0; 
    String error_message;

    if ((Math.abs(t) <= 50) && ((v <= 120) && (v > 3))) {
      w = 35.74 + 0.6215 * t + (0.4275 * t-35.75) * Math.pow(v,0.16);
      System.out.println(w);
    }

    else {
      error_message="The input values need to fulfill the following conditions: t <= 50 and 3 < v <= 120. Please try again.";
      System.out.println(error_message);
    }
} 
}