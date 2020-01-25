public class Exercise1421
{
    public static void main(String[] args)
    {
        int[] a = {2,1,8,7,2,2,7,5,3,2};
        int i = 0;
        int j = 0;
        int count = 1;
        int longestCount = 0;
        int startOfLongestCount = 0;

        while(i < a.length-1)
        {
            if(a[i] < a[i+1])
            {
                j = i + 1;
                count = 1;

                while(a[i+1] == a[i+2])
                {
                    count = count + 1;
                    i = i + 1;
                }   
                
                if(count > longestCount)
                {
                    longestCount = count; 
                    startOfLongestCount = j;
                    
                    if(a[i+1] > a[i+2] && count > 1)
                    {
                        System.out.println("The plateau's location starts at the index: "+ startOfLongestCount);
                        System.out.println("The length is "+ longestCount);
                    }
                    else
                    {   
                        System.out.println("Did not find any plateaus because either first the value after is larger than the numbers in the plateau OR the the count of the number is less than 2");
                    }
                }
            }
            i=i+1;
        }
    }
}