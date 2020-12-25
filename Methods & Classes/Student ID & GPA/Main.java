/*
Assignment 4

Create a class called Student that has 2 private data members:
• ID (long)
• GPA (double).
Additionally, the class should have:
• Two accessor method (get) for ID and GPA.
• One set method for ID and GPA.
• A method print to output ID, GPA
Write a java program that creates an object called st1 of type class student then
test all the methods in the student class .

*/

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setter(202012345, 4.00);
        st1.print();
    }
}
