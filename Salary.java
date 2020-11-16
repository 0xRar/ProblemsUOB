import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        double salary,incomeTax,CommDed,net;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the salary: ");
        salary = input.nextDouble();

        incomeTax = 0.02 * salary;
        System.out.println("income tax= "+ incomeTax);

        CommDed = 0.01 * salary;
        System.out.println("Community deduction= " +CommDed);
        net = salary - incomeTax - CommDed;

        System.out.println("Net Salary= "+ net);

        // Isa Ebrahim(0xRar)
    }
}
