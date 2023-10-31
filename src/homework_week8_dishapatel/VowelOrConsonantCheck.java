package homework_week8_dishapatel;
/**
 * Write a Java program that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

import java.util.Scanner;

public class VowelOrConsonantCheck {
    //Main method with java.util.Scanner class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a single character: ");
        String input = scanner.nextLine();

        // Check if the input is a single character and not an empty string
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char ch = Character.toLowerCase(input.charAt(0)); // Convert to lowercase for case-insensitive check

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("Error: Please enter a single letter between 'a' and 'z' or 'A' and 'Z'.");
        }

        scanner.close();//Scanner close
    }
}//Run the program