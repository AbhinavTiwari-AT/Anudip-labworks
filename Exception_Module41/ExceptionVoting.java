package Exception_module41;

// program for voting Application, take the user’s age as input and explicitly throw the exception if the user’s age is less than 18 to terminate the program.

import java.util.Scanner;

//Custom exception class for handling under age voters
class UnderAgeException extends Exception {
public UnderAgeException(String message) {
  super(message);
}
}

public class ExceptionVoting {

// Method to check if the user's age is eligible for voting
public static void checkEligibility(int age) throws UnderAgeException {
  if (age < 18) {
      throw new UnderAgeException("Sorry, you are not eligible to vote as your age is less than 18.");
  }
  System.out.println("Congratulations! You are eligible to vote.");
  // Additional logic for voting process can be added here
}

public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  try {
      System.out.print("Enter your age: ");
      int age = scanner.nextInt();
      
      // Check eligibility for voting
      checkEligibility(age);
      
  } catch (UnderAgeException e) {
      // Catching and handling the custom exception for underage voters
      System.out.println(e.getMessage());
  } catch (Exception e) {
      // Catching any other unexpected exceptions
      System.out.println("Invalid input. Please enter a valid age as a number.");
  } finally {
      scanner.close(); // Closing the scanner to prevent resource leak
  }
}
}

