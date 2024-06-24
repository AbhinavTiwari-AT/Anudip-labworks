package Strings_module_21;
import java.util.Scanner;

public class CharArray {
	public static String createStringFromCharArray(char[] chars) {
		if (chars == null) {
			return null; 
		}
		return new String(chars); // Create String object from character array
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt user to enter characters separated by spaces
		System.out.println("Enter characters separated by spaces (e.g., H e l l o):");
		String charInput = scanner.nextLine();

		// Split the input string by spaces to get individual characters
		String[] charArrayStr = charInput.split(" ");

		// Create a character array to store the extracted characters
		char[] charArray = new char[charArrayStr.length];

		// Extract the first character from each split string and store it in the
		// character array
		for (int i = 0; i < charArrayStr.length; i++) {
			charArray[i] = charArrayStr[i].charAt(0); // Extract the first character
		}

		// Create a new String object from the character array
		String str = createStringFromCharArray(charArray);

		// Print the newly created String
		System.out.println("Created String: " + str);

		scanner.close();

	}
}
