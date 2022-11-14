/*
* This program reverses a string using recursion.
*
* @author  Sydney Kuhn
* @version 1.0
* @since   2022-11-14
*/

/**
* This is the first recursion program.
*/
final class Main {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Reverses a string.
    *
    * @param aString accepts a string
    * @return the string backwards, using recursion
    */
    public static String reverseString(final String aString) {

        final String returnValue;

        if (aString.length() == 0) {
            returnValue = aString;
        } else {
            returnValue = reverseString(aString.substring(1)) + (aString.charAt(0));
        }
        return returnValue;

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Input
	// This will be the string that is reversed
	final String aString = "recursion";

	// Process
        final String reversedString = reverseString(aString);

	// Output
        System.out.println("\nThe original string is: " + aString);
        System.out.println("The reversed string is: " + reversedString);

        System.out.println("\nDone.");
    }
}
