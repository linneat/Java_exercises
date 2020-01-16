public class Exercise1230
{
  public static void main(String[] args)
   {
    double nr1 = Math.random();
    double nr2 = Math.random();
    double nr3 = Math.random();
    double nr4 = Math.random();
    double nr5 = Math.random();
    System.out.println(nr1);
    System.out.println(nr2);
    System.out.println(nr3);
    System.out.println(nr4);
    System.out.println(nr5);
    System.out.println((nr1+nr2+nr3+nr4+nr5)/5);
    System.out.println(Math.min(nr1,Math.min(nr2,Math.min(nr3,Math.min(nr4,nr5)))));
} 

}