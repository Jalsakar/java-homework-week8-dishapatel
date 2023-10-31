package homework_week8_dishapatel;
/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge
 */

import java.util.Scanner;

public class SumOfTenNumbers {
    //Declare main method
    public static void main(String[] args) {
        //create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        //Declare two integer variables
        int count = 1;
        int sum = 0;
        //While loop with condition to execute 10 times
        while (count <= 10) {
            System.out.println("Enter number # " + count + " : ");//Enter current count value
            boolean x = scanner.hasNextInt();//Check the user input is an integer
            //if-else statement
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        //calculate the sum of all 10 numbers
            System.out.println("Sum of all 10 numbers is : " + sum);
        scanner.close();//Close the Scanner object to release system resources
    }
}//Run the program