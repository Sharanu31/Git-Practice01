package pakage.String;

public class StringStartsWith {

	public static void main(String[] args) {
		String str = "JavaScript";

		// checks if "JavaScript" starts with "Java"
		System.out.println(str.startsWith("Java"));
		System.out.println(str.startsWith("J")); // true
	    System.out.println(str.startsWith("Java Program")); // true


	    System.out.println(str.startsWith("java")); // false

	    System.out.println(str.startsWith("ava")); // false
	    
	    //Java startsWith() With Offset Parameter
	    
	 // checks in substring "a Programming"
	    System.out.println(str.startsWith("Java", 3)); // false
	    System.out.println(str.startsWith("a Pr", 3)); // true
	}

}
