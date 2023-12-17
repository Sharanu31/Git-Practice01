package ListInterface;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListProgram {

	// LinkedList<Type> linkedList = new LinkedList<>();

	static void linkedListAdd() {

		LinkedList<String> animals = new LinkedList<>();
		// add() method without the index parameter
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		System.out.println("LinkedList: " + animals);

		// add() method with the index parameter
		animals.add(1, "Horse");
		System.out.println("Updated LinkedList: " + animals);
	}

	static void linkedListGet() {
		LinkedList<String> languages = new LinkedList<>();

		// add elements in the linked list
		languages.add("Python");
		languages.add("Java");
		languages.add("JavaScript");
		System.out.println("LinkedList: " + languages);

		// get the element from the linked list
		String str = languages.get(1);
		System.out.print("Element at index 1: " + str);
	}

	static void linkedListSet() {
		LinkedList<String> languages = new LinkedList<>();

		// add elements in the linked list
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");
		languages.add("Java");
		System.out.println("LinkedList: " + languages);

		// change elements at index 3
		languages.set(3, "Kotlin");
		System.out.println("Updated LinkedList: " + languages);
	}

	static void linkedListRemove() {
		LinkedList<String> languages = new LinkedList<>();

		// add elements in LinkedList
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");
		languages.add("Kotlin");
		System.out.println("LinkedList: " + languages);

		// remove elements from index 1
		String str = languages.remove(1);
		System.out.println("Removed Element: " + str);

		System.out.println("Updated LinkedList: " + languages);
	}

	static void linkedListasQueue() {
		Queue<String> languages = new LinkedList<>();

		// add elements
		languages.add("Python");
		languages.add("Java");
		languages.add("C");
		System.out.println("LinkedList: " + languages);

		// access the first element
		String str1 = languages.peek();
		System.out.println("Accessed Element: " + str1);

		// access and remove the first element
		String str2 = languages.poll();
		System.out.println("Removed Element: " + str2);
		System.out.println("LinkedList after poll(): " + languages);

		// add element at the end
		languages.offer("Swift");
		System.out.println("LinkedList after offer(): " + languages);
	}

	static void linkedListasDeque() {
		Deque<String> animals = new LinkedList<>();

		// add element at the beginning
		animals.add("Cow");
		System.out.println("LinkedList: " + animals);

		animals.addFirst("Dog");
		System.out.println("LinkedList after addFirst(): " + animals);

		// add elements at the end
		animals.addLast("Zebra");
		System.out.println("LinkedList after addLast(): " + animals);

		// remove the first element
		animals.removeFirst();
		System.out.println("LinkedList after removeFirst(): " + animals);

		// remove the last element
		animals.removeLast();
		System.out.println("LinkedList after removeLast(): " + animals);
	}

	static void iteratingThroughLinkedList() {
		// Creating a linked list
		LinkedList<String> animals = new LinkedList<>();
		animals.add("lion");
		animals.add("tiger");
		animals.add("Elephent");
		System.out.println("LinkedList: " + animals);

		// Using forEach loop
		System.out.println("Accessing linked list elements:");
		for (String animal : animals) {
			System.out.print(animal);
			System.out.print(", ");
		}
	}

	public static void main(String[] args) {
		// Add
		// LinkedListProgram.linkedListAdd();

		// get
		// LinkedListProgram.linkedListGet();

		// set
		// LinkedListProgram.linkedListSet();

		// remove
		// LinkedListProgram.linkedListRemove();

		// LinkedList as Queue
		LinkedListProgram.linkedListasQueue();

		// LinkedList as Deque
		LinkedListProgram.linkedListasDeque();

		// Iterating through LinkedList
		LinkedListProgram.iteratingThroughLinkedList();
	}
}
