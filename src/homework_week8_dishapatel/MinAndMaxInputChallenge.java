package homework_week8_dishapatel;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user
 * print the minimum and maximum number the user has entered.
 * Before the user enters the number, print the message Enter number:
 * If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge {
    //Main method
    public static void main(String[] args) {
        isMinMaxNumber();//calling static method
    }

    public static void isMinMaxNumber() {
        Scanner scanner = new Scanner(System.in);//Scanner declaration to read input from the console
        //Initializing two double variables to serve minimum and maximum numbers
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        //While loop will continue until the user enters a non-numeric value
        while (true) {
            System.out.println("Enter a number : ");
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();//If the input is a double, read the double value using scanner.nextDouble()
                //and then update min and max
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                // If the user enters a non-numeric value, break the loop.
                break;
            }//After the loop, check if the minimum and maximum values are still at their initial extreme values.
            if (min == Double.MAX_VALUE || max == -Double.MIN_VALUE) {
                // If they are, it means no valid numbers were entered, so print "No valid number entered."
                System.out.println("No valid number entered.");
            } else {
                //If valid numbers were entered, print the minimum and maximum numbers.
                System.out.println("Minimum number : " + min);
                System.out.println("Maximum number : " + max);
            }
        }
        scanner.close();//close the Scanner object to release system resources.
    }
}//Run the program