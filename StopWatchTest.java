import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
import java.util.concurrent.TimeUnit;

public class StopWatchTest
{
  public static void main(String[] args) throws InterruptedException
  {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now();  
    System.out.println(dtf.format(now));  
    System.out.println("time now in ms: " + System.currentTimeMillis()/1000);
   
    StopWatch a = new StopWatch();
    TimeUnit.SECONDS.sleep(1);
    System.out.println("The passed: " + a.elapsedTime() + " sec.");
    a.pause();
    TimeUnit.SECONDS.sleep(1);
    System.out.println("The passed: " + a.elapsedTime() + " sec.");
    a.cont();
    TimeUnit.SECONDS.sleep(1);
    System.out.println("The passed: " + a.elapsedTime() + " sec.");
  }
}