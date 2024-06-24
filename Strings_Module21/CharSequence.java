package Strings_module_21;

//java program to test if a given string contains the specified sequence of char values.
import java.util.Scanner;

public class CharSequence {

public static void main(String[] args) {
 
 Scanner scanner = new Scanner(System.in);



 System.out.print("Enter a string: ");
 String str = scanner.nextLine();

 System.out.print("Enter a sequence of characters: ");
 String sequence = scanner.nextLine();

 if (str.contains(sequence)) {
   System.out.println("The string contains the sequence");
 } else {
   System.out.println("The string does not contain the sequence");
 }
 
 scanner.close();
}
}

/*  output:-

Enter a string: abhinav
Enter a sequence of characters: abdjds
The string does not contain the sequence

Enter a string: abhinav
Enter a sequence of characters: abhinav
The string contains the sequence
 */

