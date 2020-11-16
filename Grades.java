import java.util.Scanner;
/*
Write a program in java to accept a grade and declare the equivalent
descreption.

E    :Excellent
V    :Very Good
G    :Good
A    :Average
F    :Fail
*/

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char Grade;

        System.out.print("Enter your grade: ");
        Grade = input.nextLine().charAt(0);

        if (Grade == 'E' || Grade == 'e') {
            System.out.println("Your grade description is Excellent");

        } else if (Grade == 'V' || Grade == 'v') {
            System.out.println("Your grade description is Very Good");

        } else if (Grade == 'G' || Grade == 'g') {
            System.out.println("Your grade description is Good");

        } else if (Grade == 'A' || Grade == 'a') {

            System.out.println("Your grade description is Average");

        } else if (Grade == 'F' || Grade == 'f') {
            System.out.println("Your grade description is Fail");

        } else {
            System.out.println("Something went wrong!");
        }
//        Isa Ebrahim(0xRar)
    }
}
