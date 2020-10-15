/*

Write a program that reads a student name followed by his/her id. The program should then display on screen
the student’s name followed by his/her academic year. For example, the academic year for the id 20102323 is
2010.

 */

import java.util.*;
public class academicYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int stuID,year;

        System.out.print("Enter student’s name followed by his/her academic number: ");
        name = input.next();
        stuID = input.nextInt();

        year = stuID / 10000;

        System.out.println("Name: "+name);
        // this line of code is not required
        System.out.println("Academic number: "+stuID);
        System.out.println("Academic year: "+year);

        // Isa Ebrahim (0xRar)
    }
}
