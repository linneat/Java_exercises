public class RationalTest
{
  public static void main(String[] args)
  {
    Rational a = new Rational(3, 1);
    Rational b = new Rational(5, 1);
    Rational sum = a.plus(b);
    Rational minus = a.minus(b);
    Rational times = a.times(b);
    Rational over = a.over(b);

    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(sum.toString());
    System.out.println(minus.toString());
    System.out.println(times.toString());
    System.out.println(over.toString());
  }
}