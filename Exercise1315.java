import java.text.DecimalFormat;


public class Exercise1315
{
  private static DecimalFormat df = new DecimalFormat("#.##");

  public static void main(String[] args)
  {
    System.out.printf("Monthly Pay\tPaid so far\tLeft to pay\n" );
    String sep = "\t\t";
    int years = Integer.parseInt(args[0]);
    double principle = Double.parseDouble(args[1]);
    double rate = Double.parseDouble(args[2]);
    double monthlyPay = principle * Math.exp(rate * years);
    double paidSoFar = 0;
    double totalPay = 12 * years * monthlyPay;
    double leftToPay = totalPay ;

    System.out.println(totalPay);
    System.out.println(0.1 + 0.2);


    while (leftToPay > 0.2) {
      paidSoFar = paidSoFar + monthlyPay;
      leftToPay = totalPay - paidSoFar;
      System.out.println(df.format(monthlyPay) + sep  + df.format(paidSoFar) + sep + df.format(leftToPay) + sep);
    }
  }   
}