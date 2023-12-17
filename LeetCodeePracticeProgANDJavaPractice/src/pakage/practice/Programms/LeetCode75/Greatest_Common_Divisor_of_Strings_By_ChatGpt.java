package pakage.practice.Programms.LeetCode75;

public class Greatest_Common_Divisor_of_Strings_By_ChatGpt {

	public static String gcdOfStrings(String str1, String str2) {
		if (!(str1 + str2).equals(str2 + str1)) {
			return ""; // If the strings don't have a common prefix, return an empty string.
		}

		// Find the greatest common divisor using the Euclidean algorithm.
		int length = gcd(str1.length(), str2.length());

		return str1.substring(0, length);
	}

	// Helper function to find the greatest common divisor using the Euclidean
	// algorithm.
	private static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		// Example usage:
		String str1 = "ABCABC";
		String str2 = "ABC";
		System.out.println(gcdOfStrings(str1, str2)); // Output: "ABC"

		str1 = "ABABAB";
		str2 = "ABAB";
		System.out.println(gcdOfStrings(str1, str2)); // Output: "AB"

		str1 = "LEET";
		str2 = "CODE";
		System.out.println(gcdOfStrings(str1, str2)); // Output: ""
	}

}
