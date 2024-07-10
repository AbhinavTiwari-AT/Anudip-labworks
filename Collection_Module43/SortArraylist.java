//Java program to sort a given array list.

package Collection_Module_43;

import java.util.ArrayList;   //importing arraylist
import java.util.Collections;       // importing collection class



public class SortArraylist {
	
public static void swap(ArrayList<Integer> list,int idx1 , int idx2) {

	int temp = list.get(idx1);
	list.set(idx1,list.get(idx2));
	list.set(idx2,temp);
}	
	public static void main(String[] args)
	{

	ArrayList<Integer> list = new ArrayList<>();
	list.add(2);
	list.add(5);
	list.add(9);
	list.add(3);
	list.add(6);
	
	System.out.println(list);  //printing Unshorted Array list
	Collections.sort(list);   //To Sort in Ascending order
	System.out.println(list);  // printing Shorted ArrayList
}
}

/*
 Output:-
[2, 5, 9, 3, 6]
[2, 3, 5, 6, 9]

*/
