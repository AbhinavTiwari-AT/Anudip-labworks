package conditionstatement_module7;
import java.util.Scanner;

public class positiveandnegative {
	
	public static void main(String[] agrs)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("input no");
		int input = sc.nextInt();
		
		if(input>0)
		{
			System.out.println("the no is positive");
			
		}
		else if(input<0)
		{
			System.out.println("the no is negative");
		}
		else
		{
			System.out.println("the no is zero");
		}
		 
	   
	}

}
