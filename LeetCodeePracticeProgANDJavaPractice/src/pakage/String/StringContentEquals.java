package pakage.String;

public class StringContentEquals {

	/*
	 * The contentEquals() method takes a single parameter.
	 * 
	 * either StringBuffer or charSequence
	 * 
	 * contentEquals() Return Value Returns true if the string contains the same
	 * sequence of characters as the specified parameter. If not, returns false.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";

		String str1 = "Java";
		StringBuffer sb1 = new StringBuffer("Java");
		CharSequence cs1 = "Java";

		String str2 = "JavA";
		StringBuffer sb2 = new StringBuffer("JavA");
		CharSequence cs2 = "JavA";

		System.out.println(str.contentEquals(str1)); // true
		System.out.println(str.contentEquals(sb1)); // true
		System.out.println(str.contentEquals(cs1)); // true

		System.out.println(str.contentEquals(str2)); // false
		System.out.println(str.contentEquals(sb2)); // false
		System.out.println(str.contentEquals(cs2)); // false
	}

}
