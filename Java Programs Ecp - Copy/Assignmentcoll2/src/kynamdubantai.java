
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.*;

public class kynamdubantai {

	public static void main(String[] args) throws Exception {

		List<String> names = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the strings to add in the ArrayList : 'quit' to end  ");
		String input;
		while (!(input = br.readLine()).equalsIgnoreCase("quit")) {

			names.add(input);
		}

		System.out.println(names);
		System.out.println("\n");

		System.out.println("Enter index to remove : ");
		int index = Integer.parseInt(br.readLine());
		names.remove(index);
		System.out.println("After the deletion ");
		System.out.println(names);

		System.out.println("Number of elements :" + names.size());

		System.out.println("Using the adv for loop");
		for (String name : names)
			System.out.println(name);

		System.out.println("Using the Iterator");

		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str + " : ");
		}
		System.out.println("_________________________________________");

		System.out.println("Using the List Iterator");
		ListIterator<String> li = names.listIterator();
		while (li.hasNext())
			li.next();
		while (li.hasPrevious())
			System.out.println(li.previous());
		System.out.println("--------------------------------------");

		System.out.println("Using the foreach");
		names.forEach(str -> System.out.println(str));

		System.out.println("Sorting the list :");
		Collections.sort(names);
		System.out.println(names);
		System.out.println("--------------------------------------");

		Collections.reverse(names);
		System.out.println(names);
		System.out.println("--------------------------------------");

		System.out.println("Enter the string to check in the arraylist : ");
		String Str1 = br.readLine();
		if (names.contains(Str1)) {
			System.out.println("Element is present");
			System.out.println(names.indexOf(Str1));
		} else {
			System.out.println("Element not present ");

		}

	}
}
