package homework_week8_dishapatel;

import java.util.Scanner;

/**
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit, so we don't want to process them;
 * also we don't want to process negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine
 * that it is working correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 * The method needs to be static
 * Create a class with the name DigitSumChallenge
 */
public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//It creates an instance of the Scanner class to read input from the user.
        System.out.println("Enter a number : ");//It displays a prompt asking the user to enter a number.
        int num = scanner.nextInt();//Reads the integer and stores in the variable.
        int result = sumDigit(num);//calling static method into main method
        if (result == -1) {
            System.out.println("Invalid Input : -1");
        } else {
            System.out.println("Sum of digit : " + result);
        }
        scanner.close();//closing the scanner
    }

    //The sumDigits method takes an integer number as a parameter.
    public static int sumDigit(int number) {
        // If the number is less than 10 or negative
        if (number < 10 || number < 0) {
            return -1;//so, it returns -1.
        }
        //f the number is greater than or equal to 10 and not negative,
        // it proceeds to calculate the sum of its digits using a while loop.
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;//Within the loop, it extracts the least-significant digit using number % 10.
            sum += digit;//and adds it to the sum.
            number /= 10;//It then discards the least-significant digit by updating number with number / 10.
        }
        return sum;//The method returns the sum of the digits when the loop is finished.
    }
}//Run the program.