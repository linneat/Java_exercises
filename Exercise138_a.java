public class Exercise138_a
{
  public static void main(String[] args)
  {
    int nr1;
    int nr2;
    int nr3;
    int nr4;
    int nr5;

    for (int i = 1000; (i >= 1000 && i < 2000); i = i + 5) {
      
      nr1 = i;
      nr2 = i + 1;
      nr3 = i + 2;
      nr4 = i + 3;
      nr5 = i + 4;
      System.out.printf(nr1 + " " + nr2 + " " + nr3 + " " + nr4 + " " + nr5 + "\n");
    }

    System.out.println("2000"); 
  }   
}