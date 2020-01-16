public class Exercise131
{
  public static void main(String[] args)
   {
    int nr1 = Integer.parseInt(args[0]);
    int nr2 = Integer.parseInt(args[1]);
    int nr3 = Integer.parseInt(args[2]);
    // System.out.println(nr1);
    // System.out.println(nr2);
    // System.out.println(nr3);
    
    String answer;
    if ((nr1==nr2) && (nr2==nr3)) {
        answer = "equal";
    }
    else {
        answer = "not equal";
    }
   
    System.out.printf(answer);
} 

}