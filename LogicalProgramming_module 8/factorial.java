//factorial using a while loop. The program should display the factorial as the output.

package logical_programming_module_8;
import java.util.Scanner;
class A
{
	public int m1(int number)
	{
		int fact=1;  // declaring variable 
		int i=1;
		
		while(i<=number)    
		{
			fact=fact*i;  
			i++;  
		}
		
		return fact;
	}
}
public class factorial {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);   
		System.out.print("Enter the positive number to find the factorial: ");
		int num=sc.nextInt();    // taking input from user
		A a=new A();            // object declaration
	    System.out.println("the factorial is : "+a.m1(num)); // calling and printing m1 method
		
	}
}

/* Output :-
 Enter the positive number to find the factorial: 5
the factorial is : 120

-----DRY RUN----
fact=1
i=1
Input Number = 5

while(i<number)

(1 <= 5 )//True

fact=fact*i  i.e fact = 1*1 =1

( 2 <= 5 ) // true

fact= 1*2 = 2
(3 <= 5)

fact = 2*3=6

(4 <= 5) // true

fact = 6*4=24

(5 <=5 )  //true

fact = 24*5 = 120

output :- the factorial of number is 120
 */

