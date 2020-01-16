public class Exercise319 
{
  public static void main(String[] args) 
  {
    String dna = args[0];
    boolean answer = isValidDna(dna);
    System.out.println(answer);

  }

  public static boolean isValidDna(String dna)
  {
    char[] ch = dna.toCharArray();
    for (int i = 0; i< ch.length; i++)
    {
      if(ch[i] != 'A' && ch[i] !='C' && ch[i] !='T' && ch[i] !='G')
      {
        return false;
      }
    }
    return true;
  }
}