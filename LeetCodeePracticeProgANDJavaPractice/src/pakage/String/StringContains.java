package pakage.String;

public class StringContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java String contains()";

	    // check if str1 contains "Java"
	    boolean result1 = str1.contains("Java");

	    System.out.println(result1);
	    
	    String str2 = "Java";
	    String str3 = "java";
	    Boolean result;
	    
	    // true because "Learn Java" contains "Java"
	    if (str1.contains(str2)) {

	      System.out.println(str1 + " contains " + str2);
	    }
	    else {
	      System.out.println(str1 + " doesn't contains " + str2);
	    }
	    
	    // contains() is case-sensitive
	    // false because "Learn Java" doesn't contains "java"
	    if (str1.contains(str3)) {

	      System.out.println(str1 + " contains " + str3);
	    }
	    else {
	      System.out.println(str1 + " doesn't contain " + str3);
	    }
	}

}
