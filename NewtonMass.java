import java.util.Scanner;

public class NewtonMass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float mass1,mass2,force,distance;

        System.out.print("Enter the mass1: ");
        mass1 = input.nextFloat();

        System.out.print("Enter the mass2: ");
        mass2 = input.nextFloat();

        System.out.print("Enter the distance: ");
        distance = input.nextFloat();

        force = 0.0000000667f * (mass1 * mass2) / (distance * distance);

        System.out.println("The force is = " + force);

        // Isa Ebrahim(0xRar)
    }
}
