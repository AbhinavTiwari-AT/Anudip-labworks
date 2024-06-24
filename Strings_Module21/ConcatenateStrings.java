
//Java program to concatenate a given string to the end of another string.

package Strings_module_21;

import java.util.Scanner;

public class  ConcatenateStrings{
 public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in); // Scanner object to read input

   
     System.out.print("Enter a string: ");
     String str1 = scanner.nextLine();    // Prompt the user to enter the first string

     
     System.out.print("Enter another string to concatenate: ");
     String str2 = scanner.nextLine();         // Prompt the user to enter the 2nd string
     
    
     String concatenatedString = str1.concat(str2);

     System.out.println("Concatenated String: " + concatenatedString);

     scanner.close();
 }
}

/* Output:-
 Enter a string: abhinav
Enter another string to concatenate: tiwari
Concatenated String: abhinavtiwari

*/