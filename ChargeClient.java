public class ChargeClient
{
  public static void main(String[] args)
  {
    double x = 0.25;
    double y = 0.5;
    double w = Double.parseDouble(args[0]);
    Charge c1 = new Charge(0.5, 0.5 + w, 1);
    Charge c2 = new Charge(0.5 + w, 0.5, 1);
    Charge c3 = new Charge(0.5, 0.5 - w, 1);
    Charge c4 = new Charge(0.5 - w, 0.5, 1);
    double v1 = c1.potentialAt(x, y);
    double v2 = c2.potentialAt(x, y);
    double v3 = c3.potentialAt(x, y);
    double v4 = c4.potentialAt(x, y);
    double sumV= v1+v2+v3+v4;
    System.out.println(sumV);
  }

}