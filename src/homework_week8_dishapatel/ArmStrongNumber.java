package homework_week8_dishapatel;

import java.util.Scanner;

/**
 * 10.Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1 (5*5*5)=125 (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class ArmStrongNumber {
    //Main method calls the instance method by creating object
    public static void main(String[] args) {
        ArmStrongNumber obj = new ArmStrongNumber();
        obj.isArmStrongNumber();
    }
//Instance method
    public void isArmStrongNumber() {
        Scanner scanner = new Scanner(System.in);//Scanner declaration to read the input from the console
        System.out.println("Enter a number : ");//User can enter a number
        int number = scanner.nextInt();//Reads integer input and store it in number variable
        scanner.close();//Closing Scanner to release the system resources

        int originalNumber = number;//store the original input number
        int numberOfDigits = String.valueOf(number).length();//Calculates the numbers by converting it to a String
        double sum = 0;//Initialize the variable to 0
        // The while loop with condition
        while (originalNumber > 0) {
            int reminder = originalNumber % 10;//Calculate the number by dividing it by 10 and stores it in reminder variable
            sum += Math.pow(reminder, numberOfDigits);//Update the sum
            originalNumber /= 10;//It removes the last digit from the original number by dividing it by 10
        }
        // if....else condition checks if the sum is equal to the original number or not
        if (sum == originalNumber) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}//Run the program