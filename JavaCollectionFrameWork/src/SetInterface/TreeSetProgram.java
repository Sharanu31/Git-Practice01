package SetInterface;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetProgram {

	static void insertElementsToTreeSet() {
		TreeSet<Integer> evenNumbers = new TreeSet<>();

		// Using the add() method
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		System.out.println("TreeSet: " + evenNumbers);

		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(1);

		// Using the addAll() method
		numbers.addAll(evenNumbers);
		System.out.println("New TreeSet: " + numbers);
	}

	static void accessTreeSetElements() {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("TreeSet: " + numbers);

		// Calling iterator() method
		Iterator<Integer> iterate = numbers.iterator();
		System.out.print("TreeSet using Iterator: ");
		// Accessing elements
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
	}

	static void removeElements() {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("TreeSet: " + numbers);

		// Using the remove() method
		boolean value1 = numbers.remove(5);
		System.out.println("Is 5 removed? " + value1);

		// Using the removeAll() method
		boolean value2 = numbers.removeAll(numbers);
		System.out.println("Are all elements removed? " + value2);

	}

	static void firstANDLastMethods() {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("TreeSet: " + numbers);

		// Using the first() method
		int first = numbers.first();
		System.out.println("First Number: " + first);

		// Using the last() method
		int last = numbers.last();
		System.out.println("Last Number: " + last);
	}

	static void ceilingFloorHigherLowerMethods() {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(4);
		numbers.add(6);
		System.out.println("TreeSet: " + numbers);

		// Using higher()
		System.out.println("Using higher: " + numbers.higher(4));

		// Using lower()
		System.out.println("Using lower: " + numbers.lower(4));

		// Using ceiling()
		System.out.println("Using ceiling: " + numbers.ceiling(4));

		// Using floor()
		System.out.println("Using floor: " + numbers.floor(3));

	}

	static void pollfirstPollLastMethods() {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(4);
		numbers.add(6);
		System.out.println("TreeSet: " + numbers);

		// Using pollFirst()
		System.out.println("Removed First Element: " + numbers.pollFirst());

		// Using pollLast()
		System.out.println("Removed Last Element: " + numbers.pollLast());

		System.out.println("New TreeSet: " + numbers);

	}

	// headSet(element, booleanValue)
	static void headSet() {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(4);
		numbers.add(6);
		System.out.println("TreeSet: " + numbers);

		// Using headSet() with default boolean value
		System.out.println("Using headSet without boolean value: " + numbers.headSet(5));

		// Using headSet() with specified boolean value
		System.out.println("Using headSet with boolean value: " + numbers.headSet(5, true));

	}

	// tailSet(element, booleanValue)
	static void tailSet() {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(4);
		numbers.add(6);
		System.out.println("TreeSet: " + numbers);

		// Using tailSet() with default boolean value
		System.out.println("Using tailSet without boolean value: " + numbers.tailSet(4));

		// Using tailSet() with specified boolean value
		System.out.println("Using tailSet with boolean value: " + numbers.tailSet(4, false));

	}

	// subSet(e1, bv1, e2, bv2)
	static void subSet() {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(4);
		numbers.add(6);
		System.out.println("TreeSet: " + numbers);

		// Using subSet() with default boolean value
		System.out.println("Using subSet without boolean value: " + numbers.subSet(4, 6));

		// Using subSet() with specified boolean value
		System.out.println("Using subSet with boolean value: " + numbers.subSet(4, false, 6, true));

	}

	static void unionOfSets() {
		TreeSet<Integer> evenNumbers = new TreeSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("TreeSet1: " + evenNumbers);

		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("TreeSet2: " + numbers);

		// Union of two sets
		numbers.addAll(evenNumbers);
		System.out.println("Union is: " + numbers);

	}

	static void intersectionOfSets() {
		TreeSet<Integer> evenNumbers = new TreeSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("TreeSet1: " + evenNumbers);

		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("TreeSet2: " + numbers);

		// Intersection of two sets
		numbers.retainAll(evenNumbers);
		System.out.println("Intersection is: " + numbers);

	}

	static void differenceOfSets() {
		TreeSet<Integer> evenNumbers = new TreeSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("TreeSet1: " + evenNumbers);

		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println("TreeSet2: " + numbers);

		// Difference between two sets
		numbers.removeAll(evenNumbers);
		System.out.println("Difference is: " + numbers);
	}

	static void subsetOfASet() {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println("TreeSet1: " + numbers);

		TreeSet<Integer> primeNumbers = new TreeSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		System.out.println("TreeSet2: " + primeNumbers);

		// Check if primeNumbers is subset of numbers
		boolean result = numbers.containsAll(primeNumbers);
		System.out.println("Is TreeSet2 subset of TreeSet1? " + result);

	}

	static void treeSetComparator() {
		// https://www.programiz.com/java-programming/treeset
	}

	static void implementationofSortedSetinTreeSetClass() {
		// Creating SortedSet using the TreeSet
		SortedSet<Integer> numbers = new TreeSet<>();

		// Insert elements to the set
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println("SortedSet: " + numbers);

		// Access the element
		int firstNumber = numbers.first();
		System.out.println("First Number: " + firstNumber);

		int lastNumber = numbers.last();
		System.out.println("Last Number: " + lastNumber);

		// Remove elements
		boolean result = numbers.remove(2);
		System.out.println("Is the number 2 removed? " + result);

	}

	public static void main(String[] args) {
		TreeSetProgram.insertElementsToTreeSet();
		TreeSetProgram.accessTreeSetElements();
		TreeSetProgram.removeElements();
		TreeSetProgram.firstANDLastMethods();
		TreeSetProgram.ceilingFloorHigherLowerMethods();
		TreeSetProgram.headSet();
		TreeSetProgram.tailSet();
		TreeSetProgram.subSet();
		TreeSetProgram.unionOfSets();
		TreeSetProgram.intersectionOfSets();
		TreeSetProgram.differenceOfSets();
		TreeSetProgram.implementationofSortedSetinTreeSetClass();
	}
}
