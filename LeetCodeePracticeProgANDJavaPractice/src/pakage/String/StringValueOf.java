package pakage.String;

import java.util.ArrayList;

//** The valueOf() method returns the string representation of the argument passed.
public class StringValueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double intrrst = 923.234d;
		System.out.println(String.valueOf(intrrst));
		String strVal = String.valueOf(intrrst);
		
		int a=5;
		long l = -234567L;
		double d =34d;
		float f = 23.4f;
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(l));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(f));
		
		char c = 'J';
	    char ch[] = {'J', 'a', 'v', 'a'};

	    // convert char to string
	    System.out.println(String.valueOf(c));  // "J"


	    // convert char array to string
	    System.out.println(String.valueOf(ch));  // "Java"
	
	//Subarray of a char Array to String
	    char ch1[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
	    int offset = 2;
	    int length = 4;
	    String result;

	    // subarray {'o', 'g', 'r', 'm'} is converted to string
	    result = String.valueOf(ch1, offset, length);

	    System.out.println(result);  // "ogrm"
	    
	    //Convert Object to String
	    
	    ArrayList<String> languages = new ArrayList<String>();
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("Kotlin");

	    String result1 = null;

	    // Output: "[Java, Python, Kotlin]"
	    result1 = String.valueOf(languages);

	    System.out.println(result1);
	
	}

}
