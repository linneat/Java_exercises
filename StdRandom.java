public class StdRandom
{
  public static int uniform(int N)
  {
    return (int) (Math.random()*N);
  }
   public static double uniform(double lo, double hi)
  {
    return lo + Math.random()*(hi-lo);
  }
   public static boolean bernoulli(double p)
  {
    return Math.random() < p ;
  }
  // public static double gaussian(double m, double s)
  //{
  //  return ;
  //}
  // public static double gaussian(double m, double s)
  //{
  //  return m + s *gaussian();
  //}
   public static int discrete(double[] a)
  {
    double r = uniform(0.0, 1.0);
    double sum = 0.0;
    for (int i = 0; i < a.length; i++)
    {
      sum += a[i];
      if (sum > r) return i;
    }
    return a.length - 1;
  }
   public static void shuffle(double[] a)
  {
    int n = a.length;
    for (int i = 0; i < n; i++)
    {
      int r = i + (int) (Math.random()*(n - 1));
      double t = a[i];
      a[i] = a[r];
      a[r] = t;
    }
  }

  public static void main(String[] args)
  {
/*     int n = Integer.parseInt(args[0]);
    double[] t = {0.5, 0.3, 0.1, 0.1};
    for (int i = 0; i< n; i++)
    {
      StdOut.printf(" %2d ", uniform(100));
      StdOut.printf("%8.5f ", uniform(10.0, 99.0));
      StdOut.printf("%5b ", bernoulli(0.5));
      StdOut.printf(" %2d ", discrete(t));
      StdOut.printf(" %2d ", shuffle(t));
    } */
  }
}
