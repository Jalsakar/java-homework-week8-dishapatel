package homework_week8_dishapatel;

import java.util.Scanner;

/**
 * 6.Write a program in Java to display the pattern like a triangle with a number.
 * For example : Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class TriangleWithNumber {
    //Main method with Scanner object to read input from the console
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the right-angled triangle: ");
        int numRows = scanner.nextInt();//Stores the user input in numRows variable
        //for loop
        for (int i = 1; i <= numRows; i++) {
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");//print numbers by a space
            }

            System.out.println(); // Move to the next line for the next row
        }

        scanner.close();//scanner close to release system resources
    }
}//Run the programme