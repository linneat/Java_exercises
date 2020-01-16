public class Exercise1229
{
  public static void main(String[] args)
   {
    int m = Integer.parseInt(args[0]);
    int d = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);
    int y0 = y - (14-m)/12;
    int x = y0 + y0/4 - y0/100 + y0/400;
    int m0 = m + 12 * ((14-m)/12) - 2;
    int d0 = (d + x + (31*m0)/12) % 7;
    String day = "unknown";

    if (d0==0){
      day = "sunday";
    }
    else if (d0==1){
      day = "monday";
    }
    else if (d0==2){
      day = "tuesday";
    }
    else if (d0==3){
      day = "wednesday";
    }
    else if (d0==4){
      day = "thursday";
    }
    else if (d0==5){
      day = "friday";
    }
    else if(d0==6){
      day = "saturday";
    }

    
    System.out.println(day);
}
   
}