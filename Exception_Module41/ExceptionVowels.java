

// Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels

package Exception_module41;
import java.util.Scanner;

class NoVowelException extends Exception {
	public NoVowelException(String message) {
		super(message);
	}
}

public class ExceptionVowels {

	// Method to check if the input string contains any vowels
	public static void checkForVowels(String s) throws NoVowelException {
		// Regular expression to check for vowels (both uppercase and lowercase)
		if (!s.matches(".*[AEIOUaeiou].*")) {
		
			throw new NoVowelException("The string does not contain any vowels.");
		}
	
		System.out.println("The string contains vowels.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
	
		String str = sc.nextLine();

		// Try to check for vowels and handle the custom exception if thrown
		try {
			checkForVowels(str);
		} catch (NoVowelException e) {
		
			System.out.println(e.getMessage());
		}

		// Close the scanner to avoid resource leaks
		sc.close();
	}
}