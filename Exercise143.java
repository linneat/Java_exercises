public class Exercise143
{
  public static void main(String[] args)
  {
   

    int[] v1 = {1, 2, 3};
    int[] v2 = {2, 3, 1};

    // for (int i = 0; i < v1.length; i = i + 1) {
    //    System.out.println(v1[i]); 
    // }
    // for (int i = 0; i < v2.length; i = i + 1) {
    //    System.out.println(v2[i]); 
    // }
    
    double a = Math.pow((v1[0] - v2[0]),2);
    double b = Math.pow((v1[1] - v2[1]),2);
    double c = Math.pow((v1[2] - v2[2]),2);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);   
    double eucDist = Math.sqrt(a+b+c);
    System.out.println(eucDist);
  }   
}