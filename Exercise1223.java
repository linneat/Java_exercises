public class Exercise1223
{
  public static void main(String[] args)
   {
    int d = Integer.parseInt(args[0]);
    int m = Integer.parseInt(args[1]);
    double dd = Double.valueOf(d);
    double mm = Double.valueOf(m);
    double result = dd/mm;
    System.out.println(result);
    boolean isResultBetweenLimits;
    isResultBetweenLimits = (result > 3/20) && (result <6/20);
    System.out.println(isResultBetweenLimits);
   
}
   
}