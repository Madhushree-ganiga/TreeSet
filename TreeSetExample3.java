

//Java Program to Illustrate Removal of Elements
//in a TreeSet

//Importing utility classes
import java.util.*;

//Main class
class  TreeSetExample3{

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an object of NavigableSet
		// with reference to TreeSet class
		// Declaring object of string type
		NavigableSet<String> ts = new TreeSet<>();

		// Elements are added
		// using add() method
		ts.add("canara");
		ts.add("college");
		ts.add("bantwal");
		ts.add("A");
		ts.add("B");
		ts.add("Z");

		// Print and display initial elements of TreeSet
		System.out.println("Initial TreeSet " + ts);

		// Removing a specific existing element inserted
		// above
		ts.remove("B");

		// Printing the updated TreeSet
		System.out.println("After removing element " + ts);

		// Now removing the first element
		// using pollFirst() method
		ts.pollFirst();

		// Again printing the updated TreeSet
		System.out.println("After removing first " + ts);

		// Removing the last element
		// using pollLast() method
		ts.pollLast();

		// Lastly printing the elements of TreeSet remaining
		// to figure out pollLast() method
		System.out.println("After removing last " + ts);
	}
}
