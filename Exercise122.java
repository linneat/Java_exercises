public class Exercise122
  { 
    public static void main(String[] args)
    {
      int number = Integer.parseInt(args[0]);
      double sin = Math.sin(number);
      double cos = Math.cos(number);
      double together = Math.pow(sin, 2) + Math.pow(cos, 2);
      System.out.println(together);
    }

  }