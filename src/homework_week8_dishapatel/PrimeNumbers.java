package homework_week8_dishapatel;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class PrimeNumbers {
    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner declaration
        System.out.println("Enter a number : ");//print the statement for user to enter any number
        int n = scanner.nextInt();//integer input
        //Nested if....else condition to call isPrimeNumber method into main method
        if (isPrimeNumber(n)) {
            System.out.println(n + " is a prime number : ");
        } else {
            System.out.println(n + " is not a prime number : ");
        }
        scanner.close();//Close Scanner
    }

    //Static method
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;//If the number is less than or equal to 1, it's not prime (return false).
        } else if (number <= 3) {
            return true;//If the number is 2 or 3, it's prime (return true). These are the only even prime numbers.
        } else if (number % 2 == 0 || number % 3 == 0) {
            return false;//If the number is divisible by 2 or 3, it's not prime (return false).
        }
        //Then, it enters a loop starting from i = 5,
        // it checks if the number is divisible by i or i + 2 in increments of 6,
        // up to the square root of the number (i * i <= number).
        // This is an optimization to reduce the number of iterations because
        // you only need to check factors of the form 6k ± 1 beyond 2 and 3.
        for (int i = 5; i * i < number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;//If the number is divisible by any of these factors, it's not prime (return false).
            }
        }
        return true;// Otherwise, if none of these conditions trigger, it means the number is prime (return true).
    }
}//Run the program