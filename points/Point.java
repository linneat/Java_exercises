package points;

public class Point {
  int xx; // x-coordinate
  int yy; // y-coordinate

  // point initialized from parameters
  public Point(int theXValue, int theYValue) {
    this.xx = theXValue;
    this.yy = theYValue;
  }

  public boolean isInFirstQuadrant() {
    return this.xx > 0 && this.yy > 0;
  }

  public int getX() {
    return this.xx;
  }

  public int getY() {
    return this.yy;
  }
}
