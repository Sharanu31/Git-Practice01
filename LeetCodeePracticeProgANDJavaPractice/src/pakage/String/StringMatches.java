package pakage.String;

public class StringMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a regex pattern for
	    // four letter string that starts with 'J' and end with 'a'
		String regx = "^j..a$";
		System.out.println("Java".matches(regx)); // this false becuse J is uppercase
		System.out.println("java".matches(regx)); // this true because j is lowercase
		
		
		String regex1 = "^a...s$";

	    System.out.println("abs".matches(regex1)); // false
	    System.out.println("alias".matches(regex1)); // true
	    System.out.println("an abacus".matches(regex1)); // false

	    System.out.println("abyss".matches(regex1)); // true
	    
	    // Check for Numbers
	    
	 // a search pattern for only numbers
	    String regex2 = "^[0-9]+$";

	    System.out.println("123a".matches(regex2)); // false
	    System.out.println("98416".matches(regex2)); // true

	    System.out.println("98 41".matches(regex2)); // false
	}

}
