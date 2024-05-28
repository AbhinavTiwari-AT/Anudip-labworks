//Java program that prompts the user to enter a number and then prints the multiplication table of that number using a for loop. 

package logical_programming_module_8;
import java.util.Scanner;
class multi
{
	 public void m1(int number)
	 {
		 int i;        // Declaring variables    
		 for(i=0;i<10;i++)
		 {
			 int d= number*(i+1);
			 System.out.println(d);
		 }
		 
	 } 
}

public class table {
	public static void main(String[] args)
	{
		Scanner m=new Scanner(System.in);         
		System.out.println("Enter the number");
		int num=m.nextInt();      // taking input from user
		multi a=new multi();        // object derclaration
		System.out.println("The Multiplication Table is :");
		a.m1(num);                // calling m1 method
	}

}

/*
Enter the number
3
The Multiplication Table is :
3
6
9
12
15
18
21
24
27
30

------DRY RUN-------
number = 3
int d
i = 0 :
        0 < 10 
        d= 3*(0+1) = 3
i = 1 :
        1 < 10 
        d= 3*(1+1) = 6
        
i = 2 :
        2 < 10 
        d= 3*(2+1) = 9
        
i = 3 :
        3 < 10 
        d= 3*(3+1) = 12
                      |
                      
        
i = 9 :
        9 < 10 
        d= 3*(9+1) = 30
        
                      
                      
*/
