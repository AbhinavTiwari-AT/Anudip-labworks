
//Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd

package Exception_module41;
import java.util.Scanner;


class OddException extends Exception {
	public OddException(String message) {
		super(message);
	}
}

public class OddNumberException {

	// Method to check if the number is odd and throw exception if true
	public static void checkOdd(int num) throws OddException {
		if (num % 2 != 0) {
			throw new OddException("The entered number is odd.");
		} else {
			System.out.println("Entered number is even.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();

		
			checkOdd(num);

		} catch (OddException e) {
		
			System.out.println("Exception caught: " + e.getMessage());
		} catch (Exception e) {
			
			System.out.println("Invalid input. Please enter a valid integer.");
		} finally {
			scanner.close(); // Closing the scanner to prevent resource leak
		}
	}
}
