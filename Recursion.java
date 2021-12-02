/*
 * This program reverses a string through recursion.
 *
 * @author  Jenoe Balote
 * @version 1.0
 * @since 2021-11-30
 */

import java.util.Scanner;

/**
 * This class runs the "Recursion" program.
 *
 */
final class Recursion {

    /**
     * Prevents instantiation.
     * Throw an exception IllegalStateException when called.
     *
     * @throws IllegalStateException
     *
     */
    private Recursion() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This function reverses a string through recursion.
     *
     * @param usrInput is the string inputted by the user.
     * @return the reversed string.
     */
    public static String reverse(final String usrInput) {
        // This function uses recursion to reverse a string
        // https://stackoverflow.com/questions/9723912/
        // reversing-a-string-with-recursion-in-java
        final String returnValue;

        if (null == usrInput || usrInput.length() <= 1) {
            returnValue = usrInput;
        } else {
            returnValue = reverse(usrInput.substring(1)) + usrInput.charAt(0);
        }
        return returnValue;
    }

    /**
     * This function catches user input, then outputs the reversed string.
     *
     * @param args Not used.
     *
     */
    public static void main(final String[] args) {
        final String reversedString;
        final String usrInput;

        // Input
        System.out.println("This program reverses a string by recursion.");
        final Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a string: ");

        // Output
        usrInput = myObj.nextLine();
        System.out.println("\nThe original string is: " + usrInput);
        reversedString = reverse(usrInput);
        System.out.println("The reversed string is : " + reversedString);
        System.out.println("\nDone.");
    }
}
