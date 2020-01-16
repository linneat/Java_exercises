public class Exercise138
{
  public static void main(String[] args)
  {
    int i = 1000;
    int nr1;
    int nr2;
    int nr3;
    int nr4;
    int nr5;

    while ((i >= 1000 ) && (i<2000)) {
    
      nr1 = i;
      nr2 = i + 1;
      nr3 = i + 2;
      nr4 = i + 3;
      nr5 = i + 4;
      System.out.printf(nr1 + " " + nr2 + " " + nr3 + " " + nr4 + " " + nr5 + "\n");


      i = i + 5;
    }
  }   
}