public class Exercise3110
{
  public static void main(String[] args) 
  {
    String dna = args[0];
    String conversionOfLetters = complementWC(dna);
    System.out.println(conversionOfLetters);

  }

  public static String complementWC(String letters)
  {
    char[] ch = letters.toCharArray();
    for (int i = 0; i< ch.length; i++)
    {
      if(ch[i] == 'A')
      {
        ch[i] = 'T';
      }
      else if(ch[i] == 'T')
      {
        ch[i] = 'A';
      }
      else if(ch[i] == 'C')
      {
        ch[i] = 'G';
      }
      else if(ch[i] == 'G')
      {
        ch[i] = 'C';
      }
    }
   String backToString = new String(ch);
   return backToString;
  }
}