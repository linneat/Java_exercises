public class Exercise216  {
  public static double sigmoid(double x) {
    double result = 1/(1-(Math.exp(-x)));
    return result;
  }

  public static void main(String[] args) {
    double x = 7.8;
    double resultOfSigmoid = sigmoid(x);

    System.out.println("The result of 1/(1-e^(-x)) is:" + resultOfSigmoid);
  }
}
