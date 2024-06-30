package Exception_module41;
//Java program to create a method that reads a file and throws an exception if the file is not found.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileException {
	
	public static void readFile(String filename) throws FileNotFoundException {
		File file = new File(filename);


		if (!file.exists()) {
			throw new FileNotFoundException("File '" + filename + "' not found.");
		}

		try (Scanner scanner = new Scanner(file)) {
			System.out.println("Reading file contents:");
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the file name to read: ");
		String filename = input.nextLine();

		try {
			
			readFile(filename);
		} catch (FileNotFoundException e) {
			// Catch and handle the FileNotFoundException
			System.out.println(e.getMessage());
		} finally {
			input.close(); // Closing the scanner to prevent resource leak
		}
	}
}

