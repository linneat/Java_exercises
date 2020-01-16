public class Particle
{
  double rX;
  double rY;
  double rZ;
  double m;
  double vX;
  double vY;
  double vZ;

  public Particle(double rx0, double ry0, double rz0, double m0, double vx0, double vy0, double vz0)
  {
    this.rX = rx0;
    this.rY = ry0;
    this.rZ = rz0;
    this.m = m0;
    this.vX = vx0;
    this.vY = vy0;
    this.vZ = vz0;
  }

  public double kineticEnergy()
  {
    double energy = 0.5 * this.m * (Math.pow(this.vX, 2) + Math.pow(this.vY, 2) + Math.pow(this.vZ, 2));
    return energy;
  }

}