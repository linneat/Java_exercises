public class Exercise1234
{
  public static void main(String[] args)
   {
    int nr1 = Integer.parseInt(args[0]);
    int nr2 = Integer.parseInt(args[1]);
    int nr3 = Integer.parseInt(args[2]);
    System.out.println(nr1);
    System.out.println(nr2);
    System.out.println(nr3);
    int minNr = Math.min(nr1,(Math.min(nr2,nr3)));
    int maxNr = Math.max(nr1,(Math.max(nr2,nr3)));
    int middleNr = 0;
    if (nr1==nr2 || nr1==nr3) {
        middleNr = nr1;
    }
    else if (nr2==nr3) {
        middleNr = nr2;
    }
    else if (minNr != nr1 && maxNr != nr1) {
        middleNr = nr1;
    }
    else if (minNr != nr2 && maxNr != nr2) {
        middleNr = nr2;
    }
    else if (minNr != nr3 && maxNr != nr3) {
        middleNr = nr3;
    }
    //System.out.println(minNr);
    //System.out.println(maxNr);
    //System.out.println(middleNr);
    System.out.printf(minNr + ", "+ middleNr +", "+ maxNr);
} 

}