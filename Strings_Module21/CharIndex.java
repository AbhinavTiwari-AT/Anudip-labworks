//Java program to get the character at the given index within the string. 

package Strings_module_21;

import java.util.Scanner;

public class CharIndex {
 public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter a string: "); 
     String str = scanner.nextLine();       //taking input from user

    
     System.out.print("Enter the index (between 0 and " + (str.length() - 1) + "): ");
     int index = scanner.nextInt();   // taking index from user

    
     if (index < 0 || index >= str.length()) {
         System.out.println("Error: Index is out of bounds.");
     } else {
        
         char character = str.charAt(index);

    
         System.out.println("Character at index " + index + " is: " + character);
     }

     scanner.close(); 
 }
}


/* output:-
 
Enter a string: abhcd
Enter the index (between 0 and 4): 3
Character at index 3 is: c
*/