package pakage.String;

public class StringIndexOf {

	public static void stringIndexofWIthOutPara(String str) {
		int result;

		// j is not there in the String so it will return -1
		result = str.indexOf("j");
		System.out.println(result);

		// J is there in the String so it will return current position
		result = str.indexOf("J");
		System.out.println(result);

		result = str.indexOf("ava");
		System.out.println(result);

		result = str.indexOf("rn");
		System.out.println(result);

	}

	public void stringIndexofWIthPara(String str) {

		/*
		 * Notes:
		 * 
		 * The first occurrence of 'a' in the "Learn Java programming" string is at
		 * index 2. However, the index of second 'a' is returned when str1.indexOf('a',
		 * 4) is used. It is because the search starts at index 4.
		 * 
		 * The "Java" string is in the "Learn Java programming" string. However,
		 * str1.indexOf("Java", 8) returns -1 (string not found). It is because the
		 * search starts at index 8 and there is no "Java" in "va programming".
		 */
		int result;

		// getting the index of character 'a'
		// search starts at index 4
		result = str.indexOf('a', 4);

		System.out.println(result); // 7

		// getting the index of "Java"
		// search starts at index 8
		result = str.indexOf("Java", 8);

		System.out.println(result); // -1
	}

	public static void main(String[] args) {
		stringIndexofWIthOutPara("Learn Java");
		new StringIndexOf().stringIndexofWIthPara("Learn Java programming");
	}

}
