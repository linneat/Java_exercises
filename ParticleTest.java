public class ParticleTest
{
  public static void main(String[] args)
  {
    Particle a = new Particle(1.0, 2.0, 3.0, 1.5, 2.2, 4.0, 2.2);
    double kineticEnergy = a.kineticEnergy();

    System.out.println("The kinetic energy for the particle at this position is: " + kineticEnergy);
  }
}