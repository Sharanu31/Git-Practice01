package SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {

	static void insertElementsToHashSet() {
		HashSet<Integer> evenNumber = new HashSet<>();

		// Using add() method
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("HashSet: " + evenNumber);

		HashSet<Integer> numbers = new HashSet<>();

		// Using addAll() method
		numbers.addAll(evenNumber);
		numbers.add(5);
		System.out.println("New HashSet: " + numbers);
	}

	static void accessHashSetElements() {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("HashSet: " + numbers);

		// Calling iterator() method
		Iterator<Integer> iterate = numbers.iterator();
		System.out.print("HashSet using Iterator: ");
		// Accessing elements
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
	}

	static void removeElements() {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("HashSet: " + numbers);

		// Using remove() method
		boolean value1 = numbers.remove(5);
		System.out.println("Is 5 removed? " + value1);

		boolean value2 = numbers.removeAll(numbers);
		System.out.println("Are all elements removed? " + value2);

	}

	static void UnionofSets() {
		HashSet<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("HashSet1: " + evenNumbers);

		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(3);
		System.out.println("HashSet2: " + numbers);

		// Union of two set
		numbers.addAll(evenNumbers);
		System.out.println("Union is: " + numbers);

	}

	static void intersectionOfSets() {
		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		System.out.println("HashSet1: " + primeNumbers);

		HashSet<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("HashSet2: " + evenNumbers);

		// Intersection of two sets
		evenNumbers.retainAll(primeNumbers);
		System.out.println("Intersection is: " + evenNumbers);

	}

	static void differenceofSets() {
		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		System.out.println("HashSet1: " + primeNumbers);

		HashSet<Integer> oddNumbers = new HashSet<>();
		oddNumbers.add(1);
		oddNumbers.add(3);
		oddNumbers.add(5);
		System.out.println("HashSet2: " + oddNumbers);

		// Difference between HashSet1 and HashSet2
		primeNumbers.removeAll(oddNumbers);
		System.out.println("Difference : " + primeNumbers);

	}

	static void subset() {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println("HashSet1: " + numbers);

		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		System.out.println("HashSet2: " + primeNumbers);

		// Check if primeNumbers is a subset of numbers
		boolean result = numbers.containsAll(primeNumbers);
		System.out.println("Is HashSet2 is subset of HashSet1? " + result);

	}

	public static void main(String[] args) {
		HashSetProgram.insertElementsToHashSet();
		HashSetProgram.accessHashSetElements();
		HashSetProgram.removeElements();
		HashSetProgram.UnionofSets();
		HashSetProgram.intersectionOfSets();
		HashSetProgram.differenceofSets();
		HashSetProgram.subset();
	}
}
