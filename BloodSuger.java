import java.util.Scanner;
public class BloodSuger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bloodSugerRt;

        int count = 0,countLow = 0, countNoramal = 0, countHigh = 0;

        System.out.print("Enter the patient blood sugar rate(-1 to end): ");
        bloodSugerRt = input.nextInt();


        while (bloodSugerRt != -1) {
            System.out.print("Enter the patient blood sugar rate(-1 to end): ");
            bloodSugerRt = input.nextInt();

            count++;

            //        Main statement
            if (bloodSugerRt <= 70 && bloodSugerRt > -1) {
                countLow++;

            } else if (bloodSugerRt < 140 && bloodSugerRt > 70) {
                countNoramal++;

            } else if (bloodSugerRt >= 140) {
                countHigh++;
            }
        }

//        Output & Output Formatting
        System.out.println("Total Patients: "+count);
        System.out.println("===============================");
        System.out.println("People with low blood suger : "+countLow);
        System.out.println("===============================");
        System.out.println("People with normal blood suger : "+countNoramal);
        System.out.println("===============================");
        System.out.println("People with high blood suger : "+countHigh);
        System.out.println("===============================");

//        Isa Ebrahim(0xRar)
    }
}
