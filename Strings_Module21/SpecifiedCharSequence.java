
//Java program to compare a given string to the specified character sequence.

package Strings_module_21;

import java.util.Scanner;

public class SpecifiedCharSequence {

	public static boolean compareToString(String str, String sequence) {
		if (str == null || sequence == null || str.length() != sequence.length()) {
			return false; 
		}
		return str.equals(sequence);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = scanner.nextLine();
		
		System.out.println("Enter a character sequence to compare:");
		String sequence = scanner.nextLine();

	
		if (compareToString(str, sequence)) {
			System.out.println("Strings are equal.");
		} else {
			System.out.println("Strings are not equal.");
		}

		scanner.close(); 
	}
}
