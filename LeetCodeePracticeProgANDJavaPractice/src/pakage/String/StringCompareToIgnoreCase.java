package pakage.String;

public class StringCompareToIgnoreCase {

	public static void main(String[] args) {
		String str1 = "Learn Java";
		String str2 = "learn java";
		String str3 = "Learn Kolin";
		int result;

		// comparing str1 with str2
		result = str1.compareToIgnoreCase(str2);
		System.out.println(result); // 0

		// comparing str1 with str3
		result = str1.compareToIgnoreCase(str3);
		System.out.println(result); // -1

		// comparing str3 with str1
		result = str3.compareToIgnoreCase(str1);
		System.out.println(result); // 1

	}

}
