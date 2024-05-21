package conditionstatement_module7;
import java.util.Scanner;

public class multiplicationtable {
	public static void main(String[] args)
	{
		 int j,n;

		   System.out.print("Input number of terms : ");
		    Scanner in = new Scanner(System.in);
				    n = in.nextInt();

		   System.out.println ("\n");
		   for(j=0;j<=n;j++)
		  
		     System.out.println(n+" X "+j+" = " +n*j);
		   
	}

}
