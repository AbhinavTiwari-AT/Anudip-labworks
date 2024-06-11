// java programs to perform basic calculators operations(Input from user using switch case)

package module_3;

import java.util.Scanner;
public class mainCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;        // Declaring variables
        char operator;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();               //Taking input from user

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();              //Taking input from user

        switch (operator) {             
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }

        System.out.println("Result: " + result);
    }
}

/*Output :-
 
Enter first number: 5
Enter an operator (+, -, *, /): *
Enter second number: 10
Result: 50.0

-----DRY RUN------

first number: 5
operator (+, -, *, /): *
second number: 10

switch(*)
             case '*':
             Result = 5*10 =50
 
 Result: 50.0
  
 */

