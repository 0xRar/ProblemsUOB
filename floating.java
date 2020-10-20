package com.company;

import java.util.Scanner;

/*
Write a program that reads three floating point numbers N1, N2, and N3 from the user. It is required to find
and print the value of the following formula:

    F = N1 + N1 * N2/4 - N3
*/
public class floating {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float N1,N2,N3,F;

        System.out.print("Enter floating point N1: ");
        N1 = input.nextFloat();

        System.out.print("Enter floating point N2: ");
        N2 = input.nextFloat();

        System.out.print("Enter floating point N3: ");
        N3 = input.nextFloat();

        F = N1 + (N1 * N2) / 4 - N3;

        System.out.print("The value is : "+F);

//        Isa Ebrahim(0xRar)
    }
}
