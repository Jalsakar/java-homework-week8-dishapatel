package homework_week8_dishapatel;

import java.util.Scanner;

/**
 * 11.	Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * getEvenDigitSum(-22); → should return -1 since the number is negative NOTE:
 * The method getEvenDigitSum should be defined as public static
 */
public class EvenDigitSum {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// to read input from the console.
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();//Reads the integer input and stores in the number variable
        int evenSum = getEvenDigitSum(number);//calling the getEvenDigitSum function,
        System.out.println("Sum of even digit in " + number + " is : " + evenSum);
        scanner.close();//Closing scanner
    }

    //Static method
    public static int getEvenDigitSum(int num) {
        if (num < 0) {
            return -1;//If num is less than 0, it returns -1.
        }
        int sum = 0;//Initialize a variable sum to 0. This variable will be used to store the sum of even digits in the number.
        //Enter a while loop that continues as long as num is greater than 0.
        // This loop iterates through the digits of the number from right to left.
        while (num > 0) {
            int digit = num % 10;//the code extracts the last digit of num by taking the remainder when dividing num by 10
            if (digit % 2 == 0) {
                sum = sum + digit;//If the digit is even, it adds it to the sum variable.
            }
            num = num / 10;//After processing the last digit, the code removes that digit from num by performing an integer division by 10
        }
        //The loop continues until all digits of the original number have been processed.
        return sum;//the function returns the computed sum, which is the sum of all even digits in the original number.
    }
}//Run the program