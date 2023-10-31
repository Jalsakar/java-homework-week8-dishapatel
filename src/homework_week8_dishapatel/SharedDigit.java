package homework_week8_dishapatel;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
 * If one of the numbers is not within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers,
 * such as 2 in 12 and 23; otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class SharedDigit {
    //Main method calls static method
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); //returns True - 2 appears in both numbers
        System.out.println(hasSharedDigit(9, 99));//returns False - 9 is not within the range of 10-99
        System.out.println(hasSharedDigit(15, 55));//returns True - 5 appears in 15 and 55

    }
//Static method with integer parameters with return type
    public static boolean hasSharedDigit(int a, int b) {
        //if condition checks numbers are not within valid range of 10-99
        if ((a < 10 || a > 90) || (b < 10 || b > 99)) {
            return false;//if not in range, it returns false
        }
        //Logic
        int digit1 = a % 10;
        int digit2 = a / 10;
        int digit3 = b % 10;
        int digit4 = b / 10;
        //to check if any of the digits in a and b match or not
        return (digit1 == digit3 || digit1 == digit4 || digit2 == digit3 || digit2 == digit4);
    }
}//Run the program