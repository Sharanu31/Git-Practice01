package pakage.String;

public class StringToCharArray {
	public static void main(String[] args) {
		String str = "Java Programming";

		// creating a char array
		char[] result;

		result = str.toCharArray();
		System.out.println(result); // Java Programming
		System.out.println(result[1]); // a

		for (int i = 0; i < result.length; i++) {
			System.out.println(i + " = " + result[i]);
		}
	}

}
