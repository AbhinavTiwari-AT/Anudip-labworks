// program to check whether the number is palindrome or not.

package module_3;
import java.util.Scanner;


public class palindrome {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no to check palindrome ::--  ");
		int num=scan.nextInt();  // taking input from user
		int r,sum=0,temp;        //Declaring variables
		
		temp=num;
		while(num>0)        // while loop intialization
		{
			r=num%10;        
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
		System.out.println("the number is palindrome");
		else
			System.out.println("the number is not a palindrome");
	}

}

/*  Output :-
 Enter the no to check palindrome ::--  
545
the number is palindrome

Enter the no to check palindrome ::--  
432
the number is not a palindrome


*/