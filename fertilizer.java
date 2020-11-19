import java.util.Scanner;

// IMPORTANT::: THIS PROBLEM WAS FROM TEST NUMBER 1.

public class fertilizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float backyard, bagsize, bagPrice,NumOfBags,Total;

        System.out.print("Enter backyard area: ");
        backyard = input.nextFloat();

        System.out.print("Enter fertilizer bag size: ");
        bagsize = input.nextFloat();

        System.out.print("Enter fertilizer bag price: ");
        bagPrice = input.nextFloat();

        NumOfBags =  backyard / (bagsize-4) + 1;
        System.out.println("Number of bags = " + (int)NumOfBags);

        Total = (int) NumOfBags * bagPrice;
        System.out.println("Total price = " + Total + " BD.");

        // Isa Ebrahim(0xRar)
    }
}
