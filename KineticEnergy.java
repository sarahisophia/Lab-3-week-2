import java.util.Scanner;
public class KineticEnergy
{
    public static void main(String[] args) 
    {
        double mass;
        double velocity;
        double k;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the objects mass (kilograms): ");
        mass = keyboard.nextDouble();
        
        System.out.print("Enter the object's velocity (meters per second): ");
        velocity = keyboard.nextDouble();
        
        k = kineticEnergy(mass, velocity);
        System.out.printf("The object's kinetic energy is: %,.2f %n", k);
    }


    public static double kineticEnergy(double mass, double velocity) 
    {
        return 0.5 * mass * Math.pow(velocity, 2);
    }
}
