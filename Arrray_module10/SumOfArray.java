// This Java program is to sum values of an array.

package Array_module_10;

class Array
{
	int Number[]= {6,7,8,9,1,2};
	
	public void m1()
	{
		int sum=0;
		for(int i=0;i<Number.length;i++	)
		{
		   sum=sum+Number[i];
		}
		 System.out.println("The Sum of array is : " + sum);
	}
    	
}
public class SumOfArray {
	
	public static void main(String[] args)
	{
		Array a=new Array();
		a.m1();
	}
}



/*
 -------DRY RUN------------
 Number[]= {6,7,8,9,1,2};
 Number.length = 6
 Sum=0
 
 i= 0 :
        Number[0] = 6
        Sum=  0+6 = 6
i=1 :
        Number[1] = 7
        Sum=  6+7 = 13
i=2 :
        Number[2] = 8
        Sum=  13+8 = 21
i=3 :  
        Number[3] = 9
        Sum=  21+9 = 30
i=4: 
        Number[4] = 1
        Sum=  30+1 = 31
i=5:
        Number[5] = 2 
        Sum=  31+2 = 33

output :-
 The Sum of array is : 33
*/