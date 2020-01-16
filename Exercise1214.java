public class Exercise1214
{
  public static void main(String[] args)
   {
      int number1 = Integer.parseInt(args[0]);
      int number2 = Integer.parseInt(args[1]);
      boolean IsEvenlyDivided;
      IsEvenlyDivided = (number1 % number2 == 0);
      IsEvenlyDivided = IsEvenlyDivided || (number2 % number1 == 0);
      System.out.println(IsEvenlyDivided);
   }

}
