
//Java program to get the first and last occurrence of the specified elements in a linked list.


package Collection_Module_43;

import java.util.LinkedList;
import java.util.Iterator;
	
	
	public class FirstAndLast 
	{
		public static void main(String[] args)
		{
			LinkedList<String> fru_list = new LinkedList<String>();
			fru_list.add("Guava");
			fru_list.add("Papaya");
			fru_list.add("Mulberry");
			fru_list.add("Apple");
			fru_list.add("Banana");
			fru_list.add("Cherry");
			fru_list.add("Watermelon");
			fru_list.add("Pineapple");
			System.out.println("Given linked list :" + fru_list);  
			Object f_ele = fru_list.getFirst();
			System.out.println("First Element : "+f_ele);
			Object l_ele = fru_list.getLast();
			System.out.println("Last Element : "+l_ele);
		}
	}

	/* output:-
	  Given linked list :[Guava, Papaya, Mulberry, Apple, Banana, Cherry, Watermelon, Pineapple]
	  First Element : Guava
	  Last Element : Pineapple
*/