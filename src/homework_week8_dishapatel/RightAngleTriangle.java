package homework_week8_dishapatel;
/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class RightAngleTriangle {
    //Main method with java.util.Scanner class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner Declaration
        System.out.println("Enter a number : ");//Prompts the user to enter a number
        int n = scanner.nextInt();//Integer input
        printRightTriangle(n);//calling static method
        scanner.close();//Closing Scanner
    }

    //Static method
    public static void printRightTriangle(int numRows) {
        //Inside the Nested for loop:
        //The outer loop, controlled by the variable i, iterates from 1 to numRows.
        // This loop represents each row of the triangle.
        //The inner loop, controlled by the variable j, iterates from 1 to 'i'.
        // This loop is responsible for printing the "@" symbol on the same line.
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();//Move to the next line
        }
    }
}//Run the program