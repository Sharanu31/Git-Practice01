package QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayQueueAndDequeue {

	static void implementationofDequeinArrayDequeClass() {
		// Creating Deque using the ArrayDeque class
		Deque<Integer> numbers = new ArrayDeque<>();

		// Insert Elements to Deque
		// add elements to the Deque
		numbers.offer(1);
		numbers.offerLast(2);
		numbers.offerFirst(3);
		System.out.println("Deque: " + numbers);

		// Access elements of the Deque
		int firstElement = numbers.peekFirst();
		System.out.println("First Element: " + firstElement);

		int lastElement = numbers.peekLast();
		System.out.println("Last Element: " + lastElement);

		// Remove elements from the Deque
		int removedNumber1 = numbers.pollFirst();
		System.out.println("Removed First Element: " + removedNumber1);

		int removedNumber2 = numbers.pollLast();
		System.out.println("Removed Last Element: " + removedNumber2);

		System.out.println("Updated Deque: " + numbers);
	}

	// Insert Elements to Deque

	static void elementsusingAddAddFirstANDaddLast() {
		ArrayDeque<String> animals = new ArrayDeque<>();

		// Using add()
		animals.add("Dog");

		// Using addFirst()
		animals.addFirst("Cat");

		// Using addLast()
		animals.addLast("Horse");
		System.out.println("ArrayDeque: " + animals);
	}

	// Insert elements using offer(), offerFirst() and offerLast()

	static void elementsusingOfferOfferFirstANDofferLast() {
		ArrayDeque<String> animals = new ArrayDeque<>();
		// Using offer()
		animals.offer("Dog");

		// Using offerFirst()
		animals.offerFirst("Cat");

		// Using offerLast()
		animals.offerLast("Horse");
		System.out.println("ArrayDeque: " + animals);
	}

	// Access ArrayDeque Elements
	// Access elements using getFirst() and getLast()
	static void elementsusingGetFirstANDgetLast() {
		ArrayDeque<String> animals = new ArrayDeque<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		System.out.println("ArrayDeque: " + animals);

		// Get the first element
		String firstElement = animals.getFirst();
		System.out.println("First Element: " + firstElement);

		// Get the last element
		String lastElement = animals.getLast();
		System.out.println("Last Element: " + lastElement);

	}

	// Access elements using peek(), peekFirst() and peekLast() method

	static void elementsusingPeekPeekFirstANDPeekLast() {
		ArrayDeque<String> animals = new ArrayDeque<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		System.out.println("ArrayDeque: " + animals);

		// Using peek()
		String element = animals.peek();
		System.out.println("Head Element: " + element);

		// Using peekFirst()
		String firstElement = animals.peekFirst();
		System.out.println("First Element: " + firstElement);

		// Using peekLast
		String lastElement = animals.peekLast();
		System.out.println("Last Element: " + lastElement);

	}

	// Remove ArrayDeque Elements
	// Remove elements using the remove(), removeFirst(), removeLast() method

	static void elementsUsingRemoveRemoveFirstRemoveLast() {
		ArrayDeque<String> animals = new ArrayDeque<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Horse");
		System.out.println("ArrayDeque: " + animals);

		// Using remove()
		String element = animals.remove();
		System.out.println("Removed Element: " + element);

		System.out.println("New ArrayDeque: " + animals);

		// Using removeFirst()
		String firstElement = animals.removeFirst();
		System.out.println("Removed First Element: " + firstElement);

		// Using removeLast()
		String lastElement = animals.removeLast();
		System.out.println("Removed Last Element: " + lastElement);

	}

	// Remove elements using the poll(), pollFirst() and pollLast() method

	static void elementsUsingPollPollFirstANDPollLast() {
		ArrayDeque<String> animals = new ArrayDeque<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Horse");
		System.out.println("ArrayDeque: " + animals);

		// Using poll()
		String element = animals.poll();
		System.out.println("Removed Element: " + element);
		System.out.println("New ArrayDeque: " + animals);

		// Using pollFirst()
		String firstElement = animals.pollFirst();
		System.out.println("Removed First Element: " + firstElement);

		// Using pollLast()
		String lastElement = animals.pollLast();
		System.out.println("Removed Last Element: " + lastElement);

	}

	// Remove Element: using the clear() method
	static void elementsUsingclear() {
		ArrayDeque<String> animals = new ArrayDeque<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		System.out.println("ArrayDeque: " + animals);

		// Using clear()
		animals.clear();

		System.out.println("New ArrayDeque: " + animals);

	}

	// Iterating the ArrayDeque

	static void iteratingTheArrayDeque() {
		ArrayDeque<String> animals = new ArrayDeque<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");

		System.out.print("ArrayDeque: ");

		// Using iterator()
		Iterator<String> iterate = animals.iterator();
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}

		System.out.print("\nArrayDeque in reverse order: ");
		// Using descendingIterator()
		Iterator<String> desIterate = animals.descendingIterator();
		while (desIterate.hasNext()) {
			System.out.print(desIterate.next());
			System.out.print(", ");
		}
	}

	// ArrayDeque as a Stack
	static void arrayDequeAsStack() {
		ArrayDeque<String> stack = new ArrayDeque<>();

		// Add elements to stack
		stack.push("Dog");
		stack.push("Cat");
		stack.push("Horse");
		System.out.println("Stack: " + stack);

		// Access element from top of stack
		String element = stack.peek();
		System.out.println("Accessed Element: " + element);

		// Remove elements from top of stack
		String remElement = stack.pop();
		System.out.println("Removed element: " + remElement);

	}

	public static void main(String[] args) {
		ArrayQueueAndDequeue.implementationofDequeinArrayDequeClass();
		ArrayQueueAndDequeue.elementsusingAddAddFirstANDaddLast();
		ArrayQueueAndDequeue.elementsusingOfferOfferFirstANDofferLast();
		ArrayQueueAndDequeue.elementsusingGetFirstANDgetLast();
		ArrayQueueAndDequeue.elementsusingPeekPeekFirstANDPeekLast();
		ArrayQueueAndDequeue.elementsUsingRemoveRemoveFirstRemoveLast();
		ArrayQueueAndDequeue.elementsUsingPollPollFirstANDPollLast();
		ArrayQueueAndDequeue.elementsUsingclear();
		ArrayQueueAndDequeue.iteratingTheArrayDeque();
		ArrayQueueAndDequeue.arrayDequeAsStack();
	}
}
