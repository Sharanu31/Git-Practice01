package pakage.String;

import java.util.ArrayList;

public class StringJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "I";
	    String str2 = "love";
	    String str3 = "Java";

	    // join strings with space between them
	    String joinedStr = String.join(" ", str1, str2, str3);

	    System.out.println(joinedStr);
	    
	    
	    String result;

	    result = String.join("-", "Java", "is", "fun");

	    System.out.println(result);  // Java-is-fun
	    
	    
	    ArrayList<String> text = new ArrayList<>();

	    // adding elements to the arraylist
	    text.add("Java");
	    text.add("is");
	    text.add("fun");

	    String result1;

	    result1 = String.join("**", text);

	    System.out.println(result1);  // Java-is-fun
	}

}
