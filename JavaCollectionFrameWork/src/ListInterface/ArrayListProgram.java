package ListInterface;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListProgram {
	static ArrayList<String> arrayListWithStringReturnType() {
		// create ArrayList
		ArrayList<String> languages = new ArrayList<>();

		// Add elements to ArrayList
		languages.add("Java");
		languages.add("Python");
		languages.add("Swift");
		return languages;

	}

	static ArrayList<Integer> arrayListWithIntReturnType() {
		// create ArrayList
		ArrayList<Integer> numbers = new ArrayList<>();

		// Add elements to the list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		return numbers;

	}

	// add method
	static void arrayAddMethod() {
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C#");
		System.out.println("Languages " + languages);

		// inserting based on index
		languages.add(1, "C++");
		System.out.println("Updated " + languages);

	}
	// Addall method

	static void arrayListAddAllMethod() {
		ArrayList<String> names = new ArrayList<>();
		names.add("one");
		names.add("Two");
		names.add("Three");
		names.add("Four");
		System.out.println(names);

		ArrayList<String> addAllwithOutpara = new ArrayList<>();
		addAllwithOutpara.add("Six");
		addAllwithOutpara.add("Seven");
		addAllwithOutpara.addAll(names);
		System.out.println("AddAll with out parameter" + addAllwithOutpara);

		ArrayList<String> addAllwitPara = new ArrayList<>();
		addAllwitPara.add("Ten");
		addAllwitPara.add("Eleven");
		addAllwitPara.add("Twenty");
		addAllwitPara.addAll(1, names);

		System.out.println("AddAll with parameter" + addAllwitPara);
	}

	static void arrayListClear() {
		ArrayList<Integer> numericValues = new ArrayList<>();
		numericValues.add(1);
		numericValues.add(2);
		System.out.println("Before Clearning " + numericValues);

		numericValues.clear();
		System.out.println("After Clearning " + numericValues);

	}

	static void arrayListClone() {
		// create an arraylist
		ArrayList<Integer> number = new ArrayList<>();

		number.add(10);
		number.add(23);
		number.add(5456);
		System.out.println("ArrayList: " + number);

		// create copy of number
		ArrayList<Integer> cloneNumber = (ArrayList<Integer>) number.clone();
		System.out.println("Cloned ArrayList: " + cloneNumber);

		// print the return value of clone()
		System.out.println("Return value of clone(): " + number.clone());
	}

	static void arrayListContains() {
		ArrayList<String> companyNames = new ArrayList<>();
		companyNames.add("TCS");
		companyNames.add("INFY");
		companyNames.add("L&T");
		System.out.println("Company Names :" + companyNames);

		// checking Contains condition1
		System.out.println("Company Names :" + companyNames.contains("TCS"));

		// checking Contains condition2
		System.out.println("Company Names :" + companyNames.contains("Yethi"));

	}

	static void arrayListGet() {
		// create an ArrayList
		ArrayList<String> languages = new ArrayList<>();

		// insert element to the arraylist
		languages.add("JavaScript");
		languages.add("Java");
		languages.add("Python");
		System.out.println("Programming Languages: " + languages);

		// access element at index 1
		String element = languages.get(1);
		System.out.println("Element at index 1: " + element);
	}

	static void arrayListIndex() {
		// create an ArrayList
		ArrayList<Integer> numbers = new ArrayList<>();

		// insert element to the arraylist
		numbers.add(22);
		numbers.add(13);
		numbers.add(35);
		System.out.println("Number ArrayList: " + numbers);

		// find the position of 13
		int position1 = numbers.indexOf(13);
		System.out.println("Index of 13: " + position1);

		// find the position of 50
		int position2 = numbers.indexOf(50);
		System.out.println("Index of 50: " + position2);
	}

	static void arrayListRemoveAll() {
		// create an arraylist
		ArrayList<String> languages = new ArrayList<>();

		// add elements to arraylist
		languages.add("Java");
		languages.add("JavaScript");
		languages.add("Python");
		System.out.println("Programming Languages: " + languages);

		// remove all elements from arraylist
		languages.removeAll(languages);
		System.out.println("ArrayList after removeAll(): " + languages);
	}

	static void arrayListRemoveAllformOtherArrayList() {// create an ArrayList
		ArrayList<String> languages1 = new ArrayList<>();

		// insert element at the end of arraylist
		languages1.add("Java");
		languages1.add("English");
		languages1.add("C");
		languages1.add("Spanish");
		System.out.println("Languages1: " + languages1);

		// create another arraylist
		ArrayList<String> languages2 = new ArrayList<>();

		// add elements to the arraylist
		languages2.add("English");
		languages2.add("Spanish");
		System.out.println("Languages2: " + languages2);

		// remove all elements of ArrayList2 from ArrayList1
		languages1.removeAll(languages2);
		System.out.println("Languages1 after removeAll(): " + languages1);
	}

	static void arrayListRemoveAllformHashSet() {
		// create an ArrayList
		ArrayList<Integer> numbers = new ArrayList<>();

		// add element to ArrayList
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println("ArrayList: " + numbers);

		// create a HashSet
		HashSet<Integer> primeNumbers = new HashSet<>();

		// add elements to the HashSet
		primeNumbers.add(2);
		primeNumbers.add(3);
		System.out.println("HashSet: " + primeNumbers);

		// remove all elements of HashSet from ArrayList
		numbers.removeAll(primeNumbers);
		System.out.println("ArrayList after removeAll(): " + numbers);
	}
	
	static void arrayListRemove() {
		// create an ArrayList
	    ArrayList<Integer> primeNumbers = new ArrayList<>();
	    primeNumbers.add(2);
	    primeNumbers.add(3);
	    primeNumbers.add(5);
	    System.out.println("ArrayList: " + primeNumbers);

	    // remove element at index 2
	    int removedElement = primeNumbers.remove(2);

	    System.out.println("Removed Element: " + removedElement);
	}

	static void arrayListSet(){
		 ArrayList<String> languages = new ArrayList<>();

		    // add elements in the array list
		    languages.add("Java");
		    languages.add("Kotlin");
		    languages.add("C++");
		    System.out.println("ArrayList: " + languages);

		    // change the element of the array list
		    languages.set(2, "JavaScript");
		    System.out.println("Modified ArrayList: " + languages);
	}
	public static void main(String[] args) {

		/*
		 * ArrayList<String> valueofString =
		 * ArrayListProgram.arrayListWithStringReturnType();
		 * System.out.println(valueofString); ArrayList<Integer> valueofint =
		 * ArrayListProgram.arrayListWithIntReturnType();
		 * System.out.println(valueofint);
		 */

		// Add method with paramenter and without parameter
		// ArrayListProgram.arrayAddMethod();

		// AddAll method
		// ArrayListProgram.arrayListAddAllMethod();

		// clear
		// ArrayListProgram.arrayListClear();

		// clone
		// ArrayListProgram.arrayListClone();

		// contains
		// ArrayListProgram.arrayListContains();

		// Get Method
		// ArrayListProgram.arrayListGet();

		// Index method
		// ArrayListProgram.arrayListIndex();

		// RemoveAll method different types starte's
		// Remove all elements from an ArrayList
		ArrayListProgram.arrayListRemoveAll();

		// Remove all Elements from an ArrayList Present in Another ArrayList
		ArrayListProgram.arrayListRemoveAllformOtherArrayList();

		// Remove all Elements from an ArrayList Present in a HashSet
		ArrayListProgram.arrayListRemoveAllformHashSet();
		// RemoveAll method different types end's

		// Remove method different types starte's
		ArrayListProgram.arrayListRemove();
		// Remove method different types end's
		
		//Set method in arrayList
		ArrayListProgram.arrayListSet();
		
		// refer this link for more methods https://www.programiz.com/java-programming/library/arraylist/size
	}

}
