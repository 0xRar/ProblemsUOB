package com.company;

import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numOfCopies;

        System.out.print("Enter the number of copies to be printed: ");
        numOfCopies = input.nextDouble();

        if (numOfCopies > 0 && numOfCopies <= 30) {
            System.out.println("Price per copy is BD " + 0.050);
            System.out.println("Total price is BD " + (numOfCopies * 0.050));

        } else if (numOfCopies >= 31 && numOfCopies <= 60) {
            System.out.println( "Price per copy is BD= " + 0.035);
            System.out.println("Total price is BD= " + (numOfCopies * 0.035));

        } else if (numOfCopies > 60){
            System.out.println( "Price per copy is BD= " + 0.025);
            System.out.println("Total price is BD= " + (numOfCopies * 0.025));

        } else {
            System.out.print("Something went wrong");
        }
        
        // Isa Ebrahim(0xRar)
    }
}
