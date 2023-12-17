package QueueInterface;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueProgram {

	// Insert Elements to PriorityQueue

	static void insertElementstoPriorityQueue() {
		// Creating a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();

		// Using the add() method
		numbers.add(4);
		numbers.add(2);
		System.out.println("PriorityQueue: " + numbers);

		// Using the offer() method
		numbers.offer(1);
		System.out.println("Updated PriorityQueue: " + numbers);

	}

	// Access PriorityQueue Elements
	
	static void accessPriorityQueueElements() {
		// Creating a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		numbers.add(4);
		numbers.add(2);
		numbers.add(1);
		System.out.println("PriorityQueue: " + numbers);

		// Using the peek() method
		int number = numbers.peek();
		System.out.println("Accessed Element: " + number);
	}

	// Remove PriorityQueue Elements
	
    static void removePriorityQueueElements() {
        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.println("PriorityQueue: " + numbers);

        // Using the remove() method
        boolean result = numbers.remove(2);
        System.out.println("Is the element 2 removed? " + result);

        // Using the poll() method
        int number = numbers.poll();
        System.out.println("Removed Element Using poll(): " + number);
	}
	//Iterating Over a PriorityQueue
    
    static void  iteratingOverAPriorityQueue() {
    	 // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.print("PriorityQueue using iterator(): ");

        //Using the iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
    
    //PriorityQueue Comparator
    
    static void  priorityQueueComparator() {
    	//https://www.programiz.com/java-programming/priorityqueue
    }
    
	public static void main(String[] args) {
		PriorityQueueProgram.insertElementstoPriorityQueue();
		PriorityQueueProgram.accessPriorityQueueElements();
		PriorityQueueProgram.removePriorityQueueElements();
		PriorityQueueProgram.iteratingOverAPriorityQueue();
	}
}
