import java.util.Scanner;
public class WindSpeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int windSpeed;

        System.out.print("Enter a number to start the program :");
        windSpeed = input.nextInt();

        while (windSpeed != -1) {
            System.out.print("Enter wind speed : ");
            windSpeed = input.nextInt();

            if (windSpeed < 25 && windSpeed > -1) {
                System.out.println("Not a strong wind");

            } else if (windSpeed >= 25 && windSpeed <= 38) {
                System.out.println("Strong wind");

            } else if (windSpeed >= 39 && windSpeed <= 54) {
                System.out.println("Gale");

            } else if (windSpeed >= 55 && windSpeed <= 72) {
                System.out.println("Whole Gale");

            } else if (windSpeed > 72) {
                System.out.println("Hurricane");
            }
        }
    }
}
