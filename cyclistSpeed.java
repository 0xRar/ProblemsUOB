/*
Write a Java program that will perform some calculations regarding a cyclist coasting on a road. The program
will ask the user to enter the cyclist’s initial speed Vinitial, the duration (in minutes), and the final speed Vfinal.


The program will then calculate the rate of acceleration using the formula:
acceleration = (Vfinal − Vinitial) ÷ duration


Next, calculate how long it will take for the cyclist to stop (given the initial speed and the calculated acceleration.)
The necessary formula is:

time = Vinitial ÷ acceleration

Display the acceleration and time on screen formatted to the below samples.
*/

import java.util.Scanner;
public class prob {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double initialSpeed,finalSpeed,duration,accelertation,time;

        System.out.print("Enter the initial speed of the cyclist: ");
        initialSpeed = in.nextDouble();

        System.out.print("Enter the final speed: ");
        finalSpeed = in.nextDouble();

        System.out.print("Enter the duration: ");
        duration = in.nextDouble();

        accelertation = (finalSpeed - initialSpeed) / duration;
        System.out.println("accelertation = "+accelertation);

        time = initialSpeed / accelertation;
        System.out.println(time+ " minutes to stop");

        // Isa Ebrahim (0xRar)
    }
}
