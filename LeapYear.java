public class LeapYear
{
  public static void main(String[] args)
   {
      int year = Integer.parseInt(args[0]);
      boolean IsLeapYear;
      IsLeapYear = (year % 4 == 0);
      IsLeapYear = IsLeapYear && (year % 100 != 0);
      IsLeapYear = IsLeapYear || (year % 400 == 0);
      System.out.println(IsLeapYear);
   }

}
