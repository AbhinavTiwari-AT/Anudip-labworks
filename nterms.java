
//Write a Java program to display n terms of natural numbers and their sum.


package conditionstatement_module7;

import java.util.Scanner;
public class nterms {

 public static void main(String[] args)
 {
	 
	 int sum=0;
	
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter the no");
	 int n = sc.nextInt();
	 
	 System.out.println("No intered are:"+n);
	 
	 for(int i=0;i<=n;i++)
	 {
		 System.out.println(i);
		  sum += i;
	 }
	 System.out.println("the Sum of all natural no are :" +sum);
	 
 }
}
