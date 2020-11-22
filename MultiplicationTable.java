import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Uinput,num,i=1;

        System.out.println("Enter any positive integer: ");
        Uinput = input.nextInt();

        System.out.println("Multiplication table of "+ Uinput);

        num = Uinput;
        while(i <= 10) {
            System.out.println(num +" * " + i + " = " + num * i);
            i++;
        }
//        Isa Ebrahim(0xRar)
    }
}
