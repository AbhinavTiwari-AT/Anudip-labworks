// Java program to calculate the average value of array elements.

package Array_module_10;

class Average
{
	int Array[]= {9,8,7,6,5,7,4};
	public void M1()
	{
		float Sum=0;
	    float Avg;
		for(int i=0 ; i<Array.length ; i++)
		{
			 Sum += Array[i];
		}
		Avg = Sum/Array.length;
		System.out.println("The Average of Array is :" + Avg);
	}
}

public class AverageOfArray {

	public static void main(String[] args) {
		 
		Average a= new Average();
		a.M1();

	}
}

/* -----DRY RUN----------- 
    Array[]= {9,8,7,6,5,7,4};
    Array.length=7
    Sum=0
    
i=0:
        Array[0] = 9
        Sum=  0.0+9 = 9.0
i=1 :
         Array[1] = 8
        Sum=  9.0+8 = 17.0
i=2 :
         Array[2] = 7 
        Sum=  17.0+7 = 24.0
i=3 :  
        Array[3] = 6
        Sum=  24.0+6 = 30.0
i=4: 
        Array[4] = 5
        Sum=  30.0+5 = 35.0
i=5:
        Array[5] = 7
        Sum=  35.0+7 = 42.0
i=6:
        Array[6] = 4
        Sum=  42.0+4 = 46.0
        
Avg = Sum/Array.length
Sum=46.0
Avg = 46.0/7 =6.571429

Output :-
    The Average of Array is :6.571429
    
*/    
