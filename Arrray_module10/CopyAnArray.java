// a Java program to copy an array by iterating the array.

package Array_module_10;

class Copy
{
	int array[] = {10,3,40,50,7,6};
	
	public void m1()
	{
		int[] array_copy= new int[array.length];
		
		for(int i=0; i<array.length;i++)
		{
			array_copy[i] = array[i];
		}
		for( int i : array)
		{
			System.out.print(i+ ",");
		}
		System.out.println("");
		for(int i: array_copy)
		{
			System.out.print(i+ ",");
		}
	}
}

public class CopyAnArray {
 public static void main(String[] args)
 {
	 Copy c= new Copy();
	 c.m1();
 }
}

/* Output :-
   10,3,40,50,7,6,
   10,3,40,50,7,6,
 */


