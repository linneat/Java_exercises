public class Exercise3111 
{
  public static void main(String[] args) 
  {
    String dna = args[0];
    boolean isPalidromeWC = palidromeWC(dna);
    System.out.println(isPalidromeWC);
  }

  public static boolean palidromeWC(String dna) {
    String complementWC = Exercise3110.complementWC(dna);
    String reversedComplementWC = reverseString(complementWC);
    return compareStrings(dna, reversedComplementWC);
  }

  public static String reverseString(String string)
  {
    String reversedString = new StringBuilder(string).reverse().toString();
    return reversedString;
  }

  public static boolean compareStrings(String a, String b)
  {
    return a.equals(b);
  }
}

