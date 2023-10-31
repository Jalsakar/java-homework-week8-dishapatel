package homework_week8_dishapatel;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class FibonacciNumber {
    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner declaration to read input from the console
        System.out.println("Enter the Fibonacci number : ");//User enter a number statement
        int num = scanner.nextInt();//Reads the integer input and store it in num variable
        printFibonacciNumber(num);//Calling static method into main method
        scanner.close();//Closing scanner
    }

    //Static method
    public static void printFibonacciNumber(int num) {
        //initializes two variables, num1 and num2, to 1 each.
        // These variables represent the first two terms of the Fibonacci sequence.
        int num1 = 1;
        int num2 = 1;
        //prints the initial terms, "1 1," as a part of the Fibonacci sequence.
        System.out.print("Fibonacci Sequence is : " + num1 + " " + num2 + " ");
        //for loop to calculate and print the subsequent terms of the sequence.
        //The loop starts from the third term (i = 3) and continues until the specified number of terms (n).
        for (int i = 3; i <= num; i++) {
            int sum = num1 + num2;
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;
        }
    }
}//Run the program