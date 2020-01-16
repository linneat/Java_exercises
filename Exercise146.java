public class Exercise146
{
  public static void main(String[] args)
  {
    boolean[][] a1 = 
    {
     {true, true, false}, {false, true, false}
    };
    String print = ""; 

    for (int row = 0; row < a1.length; row = row + 1)
    {
        System.out.println(java.util.Arrays.toString(a1[row]));
        
        for (int column = 0; column < a1[0].length; column = column + 1)
        {
            if (a1[row][column] == true) {
                print = "*";
            }
            else { 
                print = "_";
            }
            System.out.println("row: " + row + " column " + column + " element " + print);

        }

    }



    // int[] row1= {1, 1, 0};
    // int[] row2=  {0, 1, 0}; 
    // int[][] a2 = 
    // {
    //  row1, row2
    // };


    
  }   
}