package SetInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetProgram {

	static void creatingLinkedHashSetfromOtherCollections() {
		// Creating an arrayList of even numbers
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("ArrayList: " + evenNumbers);

		// Creating a LinkedHashSet from an ArrayList
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumbers);
		System.out.println("LinkedHashSet: " + numbers);

	}

	static void insertElementstoLinkedHashSet() {
		LinkedHashSet<Integer> evenNumber = new LinkedHashSet<>();

		// Using add() method
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("LinkedHashSet: " + evenNumber);

		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

		// Using addAll() method
		numbers.addAll(evenNumber);
		numbers.add(5);
		System.out.println("New LinkedHashSet: " + numbers);

	}

	static void accessLinkedHashSetElements() {
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("LinkedHashSet: " + numbers);

		// Calling the iterator() method
		Iterator<Integer> iterate = numbers.iterator();

		System.out.print("LinkedHashSet using Iterator: ");

		// Accessing elements
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
	}

	static void removeElementsfromHashSet() {
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("LinkedHashSet: " + numbers);

		// Using the remove() method
		boolean value1 = numbers.remove(5);
		System.out.println("Is 5 removed? " + value1);

		boolean value2 = numbers.removeAll(numbers);
		System.out.println("Are all elements removed? " + value2);
	}

	static void unionOfSets() {
		LinkedHashSet<Integer> evenNumbers = new LinkedHashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("LinkedHashSet1: " + evenNumbers);

		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
		numbers.add(1);
		numbers.add(3);
		System.out.println("LinkedHashSet2: " + numbers);

		// Union of two set
		numbers.addAll(evenNumbers);
		System.out.println("Union is: " + numbers);

	}

	static void intersectionOfSets() {
		LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		System.out.println("LinkedHashSet1: " + primeNumbers);

		LinkedHashSet<Integer> evenNumbers = new LinkedHashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("LinkedHashSet2: " + evenNumbers);

		// Intersection of two sets
		evenNumbers.retainAll(primeNumbers);
		System.out.println("Intersection is: " + evenNumbers);

	}

	static void differenceofSets() {
		LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		System.out.println("LinkedHashSet1: " + primeNumbers);

		LinkedHashSet<Integer> oddNumbers = new LinkedHashSet<>();
		oddNumbers.add(1);
		oddNumbers.add(3);
		oddNumbers.add(5);
		System.out.println("LinkedHashSet2: " + oddNumbers);

		// Difference between LinkedHashSet1 and LinkedHashSet2
		primeNumbers.removeAll(oddNumbers);
		System.out.println("Difference : " + primeNumbers);

	}

	static void subset(){
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("LinkedHashSet1: " + numbers);

        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("LinkedHashSet2: " + primeNumbers);

        // Check if primeNumbers is a subset of numbers
        boolean result = numbers.containsAll(primeNumbers);
        System.out.println("Is LinkedHashSet2 is subset of LinkedHashSet1? " + result);
    
	}
	
	public static void main(String[] args) {
		LinkedHashSetProgram.creatingLinkedHashSetfromOtherCollections();
		LinkedHashSetProgram.insertElementstoLinkedHashSet();
		LinkedHashSetProgram.accessLinkedHashSetElements();
		LinkedHashSetProgram.removeElementsfromHashSet();
		LinkedHashSetProgram.unionOfSets();
		LinkedHashSetProgram.intersectionOfSets();
		LinkedHashSetProgram.differenceofSets();
		LinkedHashSetProgram.subset();
	}
}
