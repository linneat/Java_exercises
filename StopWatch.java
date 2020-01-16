public class StopWatch
{
  private long start;
  private boolean isPaused;
  private long timePassedBeforeLastPaused;


  public StopWatch()
  {
    this.start = System.currentTimeMillis();
    this.timePassedBeforeLastPaused = 0;
    this.isPaused = false;
  }

  public double elapsedTime()
  {
    return elapsedTimeInMs() / 1000;
  }

  private long elapsedTimeInMs()
  {
    long timeSinceLastStarted = 0;
    
    if (!this.isPaused) {
      long now = System.currentTimeMillis();
      timeSinceLastStarted = now - start;
    }

    long totalTimePassed = timeSinceLastStarted + timePassedBeforeLastPaused;
    return totalTimePassed;
  }

  public void pause()
  {
    this.timePassedBeforeLastPaused = elapsedTimeInMs();
    this.isPaused = true;
  }

  public void cont()
  {
    this.isPaused = false;
    this.start = System.currentTimeMillis();
  }
}