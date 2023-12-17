package pakage.One;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import pakage.practice.Programms.LeetCode.RomanTo_Integer;

public class MainMethod {
	public static void main(String[] args) {
		// Create an ArrayList of Strings
		ArrayList<String> arrayList = new ArrayList<>();

		// Add elements to the ArrayList, including null
		arrayList.add("Hello");
		arrayList.add("World");
		arrayList.add(null);
		arrayList.add("Java");
		arrayList.add(null);

		
		System.out.println(arrayList);
		arrayList.removeAll(arrayList);
		
		// Print the elements of the ArrayList
		System.out.println("ArrayList elements:");
		for (String element : arrayList) {
			System.out.println(element);
		}
	}
}
