//Java program to iterate through all elements in a hash list.



package Collection_Module_43;

import java.util.*;


public class IteratorHash {
	
	
	public static void main (String[] args)
	{
		HashSet<String> cities = new HashSet<>();
	
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Noida");
		cities.add("Bengluru");
	
		Iterator it = cities.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

/*
Output:-
Delhi
Noida
Mumbai
Bengluru
*/