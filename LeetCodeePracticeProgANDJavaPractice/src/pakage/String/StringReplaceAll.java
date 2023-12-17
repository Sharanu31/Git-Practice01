package pakage.String;

public class StringReplaceAll {

	public static void main(String[] args) {
		String str1 = "Java123is456fun";
		String str2 = "aabbaaac";
	    // regex for sequence of digits
	    String regex = "\\d+";

	    // replace all occurrences of numeric
	    // digits by a space
	    System.out.println(str1.replaceAll(regex, " "));
	    System.out.println(str2.replace("aa","zz"));
	    
	    
	    
	    String str3 = "+a-+b";

	    // replace "+" with "#" using replaceAll()
	    // need to escape "+"
	    System.out.println(str3.replaceAll("\\+", "#"));  // #a-#b


	    // replace "+" with "#" using replace()
	    System.out.println(str3.replace("+", "#"));  // #a-#b

	}

}
