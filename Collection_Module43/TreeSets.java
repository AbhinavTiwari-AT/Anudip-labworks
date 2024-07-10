//Java program to find numbers less than 7 in a tree set.

package Collection_Module_43;

import java.util.TreeSet;

	public class TreeSets {

	    public static void main(String[] args) {
	        TreeSet<Integer> numbers = new TreeSet<>();

	        // Add some numbers to the TreeSet
	        numbers.add(1);
	        numbers.add(5);
	        numbers.add(9);
	        numbers.add(3);
	        numbers.add(7);
	        numbers.add(2);

	        // Use headSet() to get a sub-TreeSet containing numbers less than 7
	        TreeSet<Integer> numbersLessThanSeven = (TreeSet<Integer>) numbers.headSet(7);  // Cast to TreeSet (optional)

	        // Print the elements less than 7
	        System.out.println("Numbers less than 7 in the TreeSet:");
	        for (int num : numbersLessThanSeven) {
	            System.out.print(num + " ");
	        }
	    }
	}

	/* output:-
	 Numbers less than 7 in the TreeSet:
     1 2 3 5 
     */
