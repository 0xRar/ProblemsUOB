package com.company;

/*
The area of a triangle is computed by taking half the product of its base and height.
Area = 1
      ___ × base × height
       2
       
Write a program that reads the base and height of a triangle and displays the area.

*/


import java.util.*;
public class Triangle {

    public static void main(String[] args) {
        // you can use only 1 scanner you dont have to use 2
        Scanner bs = new Scanner(System.in);
        Scanner hei = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = bs.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = hei.nextDouble();

        double area = 0.5 * base * height;
        System.out.print("your answer is: "+area);

        // Isa Ebrahim (0xRar)
    }
}
