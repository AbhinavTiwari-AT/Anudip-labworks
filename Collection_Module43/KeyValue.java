//Java program to count the number of key-value (size) mappings in a map.

package Collection_Module_43;

import java.util.HashMap;
import java.util.Map;

public class KeyValue {

	public void arr()

	{

	try

	{

	int y[] = { 2 , 7, 8 , 6};

	for (int j=0; j< y.length; )

	{

	j++;

	y[j] = y[j-1];

	System.out.print(y[j] + " ");

	}}catch(IndexOutOfBoundsException ie)

	{

	ie.printStackTrace();

	}

	catch(Exception e) {

	e.printStackTrace();

	}

	}

	public static void main(String args[])

	{

		KeyValue r = new KeyValue();

	}

}


