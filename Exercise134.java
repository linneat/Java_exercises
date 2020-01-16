public class Exercise134
{
  public static void main(String[] args)
  {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    String write;

    if ((x > 0) && (x < 1) && (y > 0) && (y < 1)) {
      write = "True";
    }
    else {
      write = "False";
    }

    System.out.println(write);
  }   
}