package logical_programming_module_8;
import java.util.Scanner;
class multi
{
	 public void m1(int number)
	 {
		 int i;
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
		int num=m.nextInt();
		multi a=new multi();
		a.m1(num);
	}

}