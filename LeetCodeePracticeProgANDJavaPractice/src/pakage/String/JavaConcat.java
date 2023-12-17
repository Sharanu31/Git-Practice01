package pakage.String;

public class JavaConcat {

	public static void main(String[] args) {
		String str1 = "Learn ";
		String str2 = "Java";

		// concatenate str1 and str2
		System.out.println(str1.concat(str2)); // "Learn Java"

		// concatenate str2 and str11
		System.out.println(str2.concat(str1)); // "JavaLearn "

		// concatenate str1 and str2
		System.out.println(str1 + str2); // "Learn Java"

		// concatenate str2 and str11
		System.out.println(str2 + str1); // "JavaLearn "
	}
	/*
	 * Suppose, str1 is null and str2 is "Java". Then, str1.concat(str2) throws
	 * NullPointerException.
	 * 
	 * 
	 * Suppose, str1 is null and str2 is "Java". Then, str1 + str2 gives "nullJava".
	 */
}
