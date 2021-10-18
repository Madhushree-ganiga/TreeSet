

//Java Program to Illustrate Working of TreeSet
//From another Collection

//Importing utility classes
import java.util.*;

//Main class
class TreeSetExample2 {

	// Main driver method
	public static void main(String[] args) {

		ArrayList<String> ll = new ArrayList<String>();

		// Adding elements to ArrayList
		ll.add("Computer");
		ll.add("Science");


		// Creating TreeSet object of string type
		TreeSet<String> ts = new TreeSet(ll);
		ts.add("Portal");
		ts.add("CANARA");

		// Iterating via iterators
		Iterator<String> iter = ts.iterator();

		// Condition holds true till there is single element in th List
		while (iter.hasNext()) {
		
			// Printing all elements inside objects
			System.out.println(iter.next());
		}

	}
}
