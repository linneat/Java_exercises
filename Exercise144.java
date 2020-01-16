public class Exercise144
{
  public static void main(String[] args)
  {
   

    int[] v = {1, 2, 3, 4};
    int j = v.length - 1;

    for (int i = 0; i < v.length / 2; i = i + 1) {
        int t = v[i];
        v[i] = v[j];
        v[j] = t;
        System.out.println("swapped " + v[i] + " with " + v[j] +" i: " + i +" j: " + j); 
        System.out.println(java.util.Arrays.toString(v));
        j = j - 1;
    }


    System.out.println("array is");
    System.out.println(java.util.Arrays.toString(v));
     
  }   
}