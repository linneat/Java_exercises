public class Exercise143Improved
{
  public static void main(String[] args)
  {
   
    int n = Integer.parseInt(args[0]);

    int[] v1 = new int[n];
    for (int i = 0; i < n; i = i + 1) {
        v1[i] = (1 + i) * 2;
        System.out.println(v1[i]); 
    }
    int[] v2 = new int[n];
    for (int i = 0; i < n; i = i + 1) {
        v1[i] =  i + 1;
        System.out.println(v1[i]);
    }

    int i = 0;
    double accumulator = 0;
    while (i < n) {
        double sqrOfSub = Math.pow(v1[i] - v2[i], 2);
        accumulator = accumulator + sqrOfSub;
        i = i + 1;
    }
    double eucDist = Math.sqrt(accumulator); 
    System.out.println(eucDist);



  }   
}