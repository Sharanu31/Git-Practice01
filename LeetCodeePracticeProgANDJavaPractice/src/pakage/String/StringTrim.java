package pakage.String;

public class StringTrim {

	public static void main(String[] args) {
		String str = "This is java programming practice session     ";
		System.out.println(str.trim());
		System.out.println(str);

		String str1 = "     Learn   Java Programming ";
		String str2 = "Learn\nJava Programming\n\n   ";

		System.out.println(str1.trim());
		System.out.println(str2.trim());
		System.out.println(str2);

		String result;

		// replace all whitespace characters with empty string
		result = str1.replaceAll("\\s", "");

		System.out.println(result); // LearnJava
	}

}
