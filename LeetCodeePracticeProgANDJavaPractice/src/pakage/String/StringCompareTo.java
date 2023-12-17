package pakage.String;

//The compareTo() method compares two strings lexicographically (in the dictionary order). 
//The comparison is based on the Unicode value of each character in the strings.
public class StringCompareTo {

	public void compareToMethod(String st1, String st2) {
		int result;
		result = st1.compareTo(st2);
		System.out.println(result);
	}

	public static void compareToMethod(String st1, String st2, String st3) {
		int result;
		result = st1.compareTo(st2);
		System.out.println(result);

		result = st1.compareTo(st3);
		System.out.println(result);

		result = st3.compareTo(st1);
		System.out.println(result);
	}

	public static void main(String[] args) {
		String str1 = "Learn Java";
		String str2 = "Learn Kolin";
		new StringCompareTo().compareToMethod(str1, str2);

		String str1_1 = "Learn Java";
		String str2_2 = "Learn Java";
		String str3_3 = "Learn Kolin";
		compareToMethod(str1_1, str2_2, str3_3);
	}

}
