package pakage.String;

public class StringReplace {

	public static void main(String[] args) {
		String strVal = "bat ball";
		strVal = strVal.replace("b", "c");
		System.out.println(strVal);

		// character not in the string
		System.out.println("Hello".replace('4', 'J')); // Hello
		// Note: If the character to be replaced is not in the string, replace() returns
		// the original string.

		// substring not in the string
		System.out.println("Java".replace("C++", "C")); // Java


		System.out.println("zzz".replace("zz", "x"));
	}

}
