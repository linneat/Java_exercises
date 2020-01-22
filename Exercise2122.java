public class Exercise2122
{
  public static Boolean any(Boolean[] a){
    int count = 0;
    
    for (int i = 0; i < a.length; i++) {
      if (a[i]){
        count++;
      }
    }
    return count > 0;
  }

  public static Boolean all(Boolean[] a){
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == true){
        count++;
      }
   }
    return count == a.length;
  }

public static Boolean any2(Boolean[] a){
  for (int i = 0; i < a.length; i++) {
    if (a[i] == true){
      return true; 
    }
   }
   return false;
  }

  public static Boolean all2(Boolean[] a){
    boolean allTrueSoFar = true;
    
    for (int i = 0; i < a.length; i++) {
      allTrueSoFar = allTrueSoFar && (a[i] == true);
    }
  
    return allTrueSoFar;
  }



  public static void main(String[] args)
  {
    Boolean[] arrayOfBooleans = {false, true, true, true};
    //call method to test for at least item one true:
    Boolean atLeastOneTrue = any(arrayOfBooleans);
    //call method for all of the items are true:
    Boolean allAreTrue = all(arrayOfBooleans);
    System.out.println(atLeastOneTrue);
    System.out.println(allAreTrue);

 



  }
}
