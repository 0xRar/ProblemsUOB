import java.util.Scanner;
/*
Blood sugar is considered normal if its rate is less than 140 and greater than 70, it is considered high if its rate
is greater than or equal to 140, and it is considered low if its rate is less than or equal to 70.

Write a Java program that asks the user to input the rate of blood sugar of each patient in a hospital (-1 to
indicate the end of the data.) The program should calculate and print the number of patients with normal blood
sugar, number of patients with high blood sugar, number of patients with low blood sugar, and the total number
of patients entered by the user.
 */

public class BloodSuger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bloodSugerRt;

        String low = "[low]";
        String normal = "[normal]";
        String high = "[high]";


        System.out.print("Enter the patient blood sugar rate(-1 to end): ");
        bloodSugerRt = input.nextInt();

//        Main if-else statement
        if (bloodSugerRt <= 70 && bloodSugerRt > -1) {
            System.out.println("your blood suger rate is "+low);

        } else if (bloodSugerRt < 140  && bloodSugerRt > 70) {
            System.out.println("your blood suger rate is "+normal);

        } else if (bloodSugerRt >= 140) {
            System.out.println("your blood suger rate is "+high);
        }




        while(bloodSugerRt != -1) {
            System.out.print("Enter the patient blood sugar rate(-1 to end): ");
            bloodSugerRt = input.nextInt();

//            dummy if-else statement
            if (bloodSugerRt <= 70 && bloodSugerRt > -1) {
                System.out.println("your blood suger rate is "+low);

            } else if (bloodSugerRt < 140  && bloodSugerRt > 70) {
                System.out.println("your blood suger rate is "+normal);

            } else if (bloodSugerRt >= 140) {
                System.out.println("your blood suger rate is "+high);
            }
        }
//        Isa Ebrahim(0xRar)
    }
}
