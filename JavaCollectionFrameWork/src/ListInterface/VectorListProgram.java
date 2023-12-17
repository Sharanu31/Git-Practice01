package ListInterface;

import java.util.Iterator;
import java.util.Vector;

public class VectorListProgram {

	static void addingInVector() {
		Vector<String> mammals = new Vector<>();

		// Using the add() method
		mammals.add("Dog");
		mammals.add("Horse");

		// Using index number
		mammals.add(2, "Cat");
		System.out.println("Vector: " + mammals);

		// Using addAll()
		Vector<String> animals = new Vector<>();
		animals.add("Crocodile");

		animals.addAll(mammals);
		System.out.println("New Vector: " + animals);
	}

	static void accessInVector() {
		Vector<String> animals = new Vector<>();
		animals.add("Dog");
		animals.add("Horse");
		animals.add("Cat");

		// Using get()
		String element = animals.get(2);
		System.out.println("Element at index 2: " + element);

		// Using iterator()
		Iterator<String> iterate = animals.iterator();
		System.out.print("Vector: ");
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
	}

	static void removeVectorElements() {
		Vector<String> animals = new Vector<>();
		animals.add("Dog");
		animals.add("Horse");
		animals.add("Cat");

		System.out.println("Initial Vector: " + animals);

		// Using remove()
		String element = animals.remove(1);
		System.out.println("Removed Element: " + element);
		System.out.println("New Vector: " + animals);

		// Using clear()
		animals.clear();
		System.out.println("Vector after clear(): " + animals);

	}

	public static void main(String[] args) {
		VectorListProgram.addingInVector();
		VectorListProgram.accessInVector();
		VectorListProgram.removeVectorElements();
	}
}
