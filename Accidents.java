import java.util.Scanner;
public class Accidents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int YearlyFee = 50, accidents, fees;

        System.out.print("Enter numbers of accidents: ");
        accidents = input.nextInt();

        if (accidents < 3) {
            fees = YearlyFee + (accidents*20);
            System.out.println("20 BD for every accident");
            System.out.println("total fees: " + fees + " BD");

        } else if (accidents >= 3 || accidents <= 4) {
            fees = YearlyFee + (accidents*50);
            System.out.println("50 BD for every accident");
            System.out.println("total fees: " + fees + " BD");

        } else if (accidents > 4) {
            fees = YearlyFee + (accidents*75);
            System.out.println("75 BD for every accident");
            System.out.println("total fees: " + fees + " BD");

        } else {
            System.out.println("Invalid");
        }
//        Isa Ebrahim(0xRar)
    }
}
