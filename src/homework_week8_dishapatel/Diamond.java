package homework_week8_dishapatel;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a diamond.
 * Use While loop
 */
public class Diamond {
    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner Declaration
        System.out.println("Enter a number : ");//input integer
        int n = scanner.nextInt();//reads the integer and stores it in variable
        printDiamond(n);//calling static method directly
        scanner.close();//Closing Scanner
    }

    //Instance method for diamond to print
    public static void printDiamond(int n) {
        //Upper half of the diamond
        int i = 1;
        while (i <= n) {
            int j = 1;//print space
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            //Print asterisks
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        //Lower half of the diamond
        i = n - 1;
        while (i >= 1) {
            //Print space
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            //Print *
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}//Run the program