package com.company;
/*
Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature.
Your program should prompt the user to enter the amount of water in kilograms and the initial and final
temperature of the water. The formula to compute the energy is

Q = M × (final temperature − initial temperature) × 4184

Where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy Q is measured in
joules. Format your output to three decimal places.

*/

import java.util.Scanner;

public class energyNeeded {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Double Q,M,FinalTemp,InitialTemp;

        System.out.print("Enter the water amount: ");
        M = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        InitialTemp = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        FinalTemp = input.nextDouble();

        Q = M * (FinalTemp - InitialTemp) * 4184;

        System.out.println("---------------------------------");
        System.out.println("The energy needed is : "+ Q);
        System.out.println("---------------------------------");
        
        // Isa Ebrahim(0xRar)
    }
}
