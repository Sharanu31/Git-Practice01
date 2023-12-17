package ListInterface;

import java.util.Stack;

public class StackListProgram {

	static void pushMethod() {
		Stack<String> animals = new Stack<>();

		// Add elements to Stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");

		System.out.println("Stack: " + animals);
	}

	static void popMethod() {
		Stack<String> animals = new Stack<>();

		// Add elements to Stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		System.out.println("Initial Stack: " + animals);

		// Remove element stacks
		String element = animals.pop();
		System.out.println("Removed Element: " + element);

	}

	static void peekMethod() {
		Stack<String> animals = new Stack<>();

		// Add elements to Stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		System.out.println("Stack: " + animals);

		// Access element from the top
		String element = animals.peek();
		System.out.println("Element at top: " + element);

	}

	static void searchMethod() {
		Stack<String> animals = new Stack<>();

		// Add elements to Stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		System.out.println("Stack: " + animals);

		// Search an element
		int position = animals.search("Horse");
		System.out.println("Position of Horse: " + position);

	}

	static void emptyMethod() {
		Stack<String> animals = new Stack<>();

		// Add elements to Stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		System.out.println("Stack: " + animals);

		// Check if stack is empty
		boolean result = animals.empty();
		System.out.println("Is the stack empty? " + result);

	}

	public static void main(String[] args) {
		StackListProgram.pushMethod();
		StackListProgram.popMethod();
		StackListProgram.searchMethod();
		StackListProgram.emptyMethod();
	}
}
