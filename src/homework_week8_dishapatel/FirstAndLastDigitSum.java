package homework_week8_dishapatel;

import java.util.Scanner;

/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * Example input/output
 * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit,
 * which gives us 0+0 and the sum is 0.
 * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit,
 * which gives us 5+5 and the sum is 10.
 * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
public class FirstAndLastDigitSum {
    //Main method with following steps:
    //Creates a Scanner object to read input from the console.
    //Prompts the user to enter a number and stores the input in the n variable.
    //Closes the Scanner object to release system resources.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        scanner.close();
        //Calls the sumFirstAndLastDigit method with the input number n and stores the result in the result variable.
        int result = sumFirstAndLastDigit(n);
        //Checks the value of result using an if...else statement:
        //If result is equal to -1, it means the input number was negative,
        //so it prints an error message, indicating that the input is invalid.
        //If result is not -1, it prints the sum of the first and last digits of the number.
        if (result == -1) {
            System.out.println("Invalid input. Please enter positive number"); // error message
        } else {
            System.out.println("Sum of the first and last digit number is: " + result);// valid output message
        }
    }
    //Static method with parameter

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers, indicating that the input is invalid.
        }
        //Extract the last digit of the number by using the modulo operator (% 10), storing it in the lastDigit variable.
        int lastDigit = number % 10;
        //while loop will continue as long as the number is greater than or equal to 10.
        while (number >= 10) {
            number /= 10; // Remove the last digit until only the first digit remains
        }

        int firstDigit = number; // The remaining number is stored as first digit variable

        return firstDigit + lastDigit; // Return the sum of the first and last digits
    }
}//Run the program