public class Roots 
{
  double a;
  double b;
  double c;

  public Roots(double a, double b, double c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  } 


  public Complex rootX1()
  {
    double part1 = -b;
    double part2 = (Math.pow(b,2)) - (4*a*c);
    double part3 = 2*a;
    Complex part1Complex = new Complex(part1, 0);
    Complex part2Complex = new Complex(part2, 0);
    Complex part3Complex = new Complex(part3, 0);
    System.out.println(part1Complex);
    System.out.println(part2Complex);
    System.out.println(part3Complex);

    if (part2 < 0)
    {
      part2Complex = new Complex(Math.sqrt(-part2), 1);
    }
    else
    {
      part2Complex = new Complex(Math.sqrt(part2), 0);
    }

    System.out.println(part2Complex);

    Complex top = part1Complex.plus(part2Complex);
    Complex x1 = top.division(part3Complex);
    return x1;
  }

  public Complex rootX2()
  {
    double part1 = -b;
    double part2 = Math.pow(b,2) - 4*a*c;
    double part3 = 2*a;
    Complex part1Complex = new Complex(part1, 0);
    Complex part2Complex = new Complex(part2, 0);
    Complex part3Complex = new Complex(part3, 0);

    if (part2 < 0)
    {
      part2Complex = new Complex(Math.sqrt(-part2), 1);
    }
    else
    {
      part2Complex = new Complex(Math.sqrt(part2), 0);
    }

    Complex top = part1Complex.minus(part2Complex);
    Complex x2 = top.division(part3Complex);
    return x2;
  }
}