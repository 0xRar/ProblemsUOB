import java.util.Scanner;
public class pasta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char choice;
        double BaseChicken=2.5, BaseMeat=2.1, BaseVege=2.1, appetizer=1.2;

        System.out.println("Enter pasta type: C for chicken, M for Meat, V for Vegetables: ");
        choice = input.nextLine().charAt(0);

        if (choice == 'C') {
            System.out.println("Enter number of appetizer: ");
            int appe = input.nextInt();

            double total = (BaseChicken + appetizer * appe);
            System.out.println("Net price is BD. "+total);

        } else if (choice == 'M') {
            System.out.println("Enter number of appetizer: ");
            int appe = input.nextInt();

            double total = (BaseMeat + appetizer * appe);
            System.out.println("Net Price is BD. "+total);

        } else if (choice == 'V') {
            System.out.println("Enter number of appetizer: ");
            int appe = input.nextInt();

            double total = (BaseVege + appetizer * appe);
            System.out.println("Net Price is BD. "+total);

        } else {
            System.out.println("Wrong choice , try again.");

        }
        // Isa Ebrahim(0xRar)
    }
}
