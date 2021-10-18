

//Java program to demonstrate working of
//TreeSet.
import java.util.TreeSet;
class  TreeSetExample1 {

	public static void main(String[] args)
	{
		// Create a TreeSet
		TreeSet<String> tset = new TreeSet<String>();

		// add elements to HashSet
		tset.add("Taj");
		tset.add("Mahal");
		tset.add("Resort");
		tset.add("Kerala");

		// Duplicate removed
		tset.add("Kerala");

		// Displaying TreeSet elements
		System.out.println("TreeSet contains: ");
		for (String temp : tset) {
			System.out.println(temp);
		}
	}
}
