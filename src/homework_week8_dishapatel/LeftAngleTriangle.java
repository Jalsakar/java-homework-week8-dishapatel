package homework_week8_dishapatel;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class LeftAngleTriangle {
    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner declaration
        System.out.println("Enter a number : ");
        int row = scanner.nextInt();//Integer input
        LeftAngleTriangle obj = new LeftAngleTriangle();//Object creation for instance method
        obj.leftTriangle(row);//calling instance method into main method
        scanner.close();//closing scanner
    }

    // Instance method
    public void leftTriangle(int row) {
        //for loop for n number of rows as needed, start with 1
        for (int i = 1; i <= row; i++) {
            //Loop through each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //Move to the next line to start a new row
            System.out.println();
        }
    }
}//Run the program