public class Exercise1215
{
  public static void main(String[] args)
   {
      int nr1 = Integer.parseInt(args[0]);
      int nr2 = Integer.parseInt(args[1]);
      int nr3 = Integer.parseInt(args[2]);
      boolean isNumberXBiggerThanSum;
      isNumberXBiggerThanSum = (nr1 >= nr2 + nr3) || (nr2 >= nr1 + nr3) || (nr3 >= nr1 + nr2);
      System.out.println(isNumberXBiggerThanSum);
   }
}
