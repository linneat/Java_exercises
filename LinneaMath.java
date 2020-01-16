public class LinneaMath
{
  public static int max(int a, int b) 
  {
    int maxValue = 0;
    if (a >= b) {
      maxValue = a;
    }
    else {
      maxValue = b;
    }
    return maxValue;
  }

  public static int min(int a, int b) 
  {
    int minValue = 0;
    if (a < b) {
      minValue = a;
    }
    else {
      minValue = b;
    }
    return minValue;
  }

  public static double random() 
  {
    return Math.random();
  }



  public static void main(String[] args){
    int maxValue = max(2,4);
    System.out.println("The max value of 2 and 4 is: " + maxValue);

  }
}
