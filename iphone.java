package com.company;


/*
An electronics store sells Apple iPhone XR in payments over a year,
two, three, or four years to customers. Write a program asking to enter
the name of the customer (string) and the price of the Apple iPhone XR (double),
and then print a proposed schedule for the payments that the customer
will pay monthly during one, two , three and four years.
(Assuming there is no interest rate).


monthly payment for one year=price ÷12
monthly payment for two years=price ÷(12 x 2)
monthly payment for three years=price ÷(12 x 3)
monthly payment for four years=price ÷(12 x 4)

*/

import java.util.Scanner;

public class iphone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        Double price;

        System.out.print("Enter customer name: ");
        name = input.nextLine();

        System.out.print("Enter Apple iPhone XR price: ");
        price = input.nextDouble();

        System.out.println(name+ " your monthly payment for one year = " + price / 12);
        System.out.println(name+ " your monthly payment for two years = " + price / (12 * 2) );
        System.out.println(name+ " your monthly payment for three years = " + price / (12 * 3) );
        System.out.println(name+ " your monthly payment for four years = " + price / (12 * 4) );

        // Isa Ebrahim(0xRar)
    }
}
