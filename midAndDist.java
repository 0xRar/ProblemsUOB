import java.util.Scanner;

public class midAndDist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Medium;
        float distance,time, Air = 1100, Water = 4900, Steel = 16400;

        System.out.print("Enter a Medium: ");
        Medium = input.nextLine();

        System.out.print("Enter the distance: ");
        distance = input.nextFloat();

        if (Medium.equalsIgnoreCase("Air")) {
            time = (int) distance / Air;
            System.out.println("The time to travel in Air is " + time + " feet.");

        } else if (Medium.equalsIgnoreCase("Water")) {
            time = (int) distance / Water;
            System.out.println("The time to travel in Water is " + time + " feet.");

        } else if (Medium.equalsIgnoreCase("Steel")) {
            time = (int) distance / Steel;
            System.out.println("The time to travel in Steel is " + time + " feet.");

        } else {
            System.out.println("invalid message!");
            System.exit(0);
        }
//        Isa Ebrahim(0xRar)        
    }
}
