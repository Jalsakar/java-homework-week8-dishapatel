package homework_week8_dishapatel;
/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to 11212
 * What is a Palindrome number? A palindrome number is a number which when reversed is equal to the original number.
 * For example: 121, 12321, and 1001 etc.
 * Tip: Logic to check a palindrome number
 * Find the reverse of the given number. Store it in some variable, say reverse. Compare the number with the reverse.
 * If both are the same then the number is a palindrome otherwise it is not
 */

import java.util.Scanner;

public class PalindromeNumbers {
    //Main method does the following:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Creates a Scanner object to read input from the console.
        System.out.println("Enter a number : ");//Prompts the user to enter a number
        int num = scanner.nextInt();//Input integer stores in num variable
        //Calling static method into main method
        if (isPalindromeNumber(num)) {
            System.out.println(num + " is a Palindrome number.");
        } else {
            System.out.println(num + " is not a Palindrome number.");
        }
        scanner.close();//Closes the Scanner object to release system resources.
    }
    //Static method checks whether a given integer is a palindrome
    public static boolean isPalindromeNumber(int number) {
        //if condition
        if (number < 0) {
            number = Math.abs(number);// If the input is negative, it takes the absolute value to make it positive
        }
        int originalNumber = number;//the original number will compare with its reverse number later
        int reverseNumber = 0;//This variable will be used to store the reverse of the number.
        //while loop continues as long as the number is grater than 0.
        while (number > 0) {
            int digit = number % 10;//Calculate the last digit of the number by taking the remainder when dividing it by 10.
            reverseNumber = reverseNumber * 10 + digit;//get the reverse number and multiply with 10 and add to the last digit
            number /= 10;//remove the last digit from the number by dividing it by 10
        }
        return originalNumber == reverseNumber;
        //After the while loop finishes,
        // the code checks if originalNumber (the original input) is equal to reverseNumber (the reverse of the input).
        // If they are equal, it means that the input number is a palindrome, and the code returns true.
        // Otherwise, it returns false
    }
}//Run the program