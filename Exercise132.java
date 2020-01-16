public class Exercise132
{
  public static void main(String[] args)
   {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);
    double d = b*b - 4*a*c;
    double x11;
    double x22;
    double x1;
    double x2;
    String answer;
    if (a!=0) {
        if (d<0) {
            answer="there is no solution because d<0";
            System.out.printf(answer);
        }
        else {
            answer="there are two solutions for x:";
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            System.out.printf(answer +" x1="+ x1 +" x2="+ x2);
        }
    }
    else {
        answer="a cannot be 0 because you cannot divide by 0";
        System.out.printf(answer);
    }

    
} 

}