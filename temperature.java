
/*
Write a Java program that will predict tomorrow’s temperature given today’s temperature readings. The program
will first ask the user to enter two values: the temperature median value and current temperature reading. The
program will calculate and display the expected temperature according to the following equation:

Expected temperature = 2 × median temperature − current temperature

Format your output to two decimal places.
*/


import java.util.Scanner;
public class temperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double MedianTemp,ExpectedTemp,currentTemp;

        System.out.print("Enter temperature median value: ");
        MedianTemp = input.nextDouble();

        System.out.print("Enter current temperature reading: ");
        currentTemp = input.nextDouble();

        ExpectedTemp = 2 * MedianTemp - currentTemp;

        System.out.print("Expected temperature: "+ ExpectedTemp);

//        Isa Ebrahim(0xRar)
    }
}
