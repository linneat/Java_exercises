public class Rational
{
  int myNumerator;
  int myDenominator;

  public Rational(int numerator, int denominator)
  {
    this.myNumerator = numerator;
    this.myDenominator = denominator;
  }

  public Rational plus(Rational b)
  {
    int newNumerator = myNumerator * b.myDenominator + b.myNumerator * myDenominator;
    int newDenominator = myDenominator * b.myDenominator;
    Rational sum = new Rational(newNumerator, newDenominator);
    return sum;
  }

  public Rational minus(Rational b)
  {
    int newNumerator = myNumerator * b.myDenominator - b.myNumerator * myDenominator;
    int newDenominator = myDenominator * b.myDenominator;
    Rational result = new Rational(newNumerator, newDenominator);
    return result;
  }

  public Rational times(Rational b)
  {
    int newNumerator = myNumerator * b.myNumerator;
    int newDenominator = myDenominator * b.myDenominator;
    Rational result = new Rational(newNumerator, newDenominator);
    return result;

  }

  public Rational over(Rational b)
  {
    // Swaping brøken
    int newNumeratorA = myDenominator;
    int newDenominatorA = myNumerator;
    int newNumeratorB = b.myDenominator;
    int newDenominatorB = b.myNumerator;

    int newNumerator = newNumeratorA * newNumeratorB;
    int newDenominator = newDenominatorA * newDenominatorB; 

    Rational result = new Rational(newNumerator, newDenominator);
    return result;
  }

  public String toString()
  {
    return this.myNumerator + "/" + this.myDenominator;
  }

}