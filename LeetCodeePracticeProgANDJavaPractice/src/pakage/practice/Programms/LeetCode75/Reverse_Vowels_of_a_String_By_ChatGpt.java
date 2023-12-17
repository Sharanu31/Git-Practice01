package pakage.practice.Programms.LeetCode75;

public class Reverse_Vowels_of_a_String_By_ChatGpt {
	public static void main(String[] args) {
		System.out.println(reverseVowels("hello")); // Output: "holle"
		System.out.println(reverseVowels("leetcode")); // Output: "leotcede"
	}

	public static String reverseVowels(String s) {
		char[] chars = s.toCharArray();
		int i = 0;
		int j = chars.length - 1;

		while (i < j) {
			while (i < j && !isVowel(chars[i])) {
				i++;
			}

			while (i < j && !isVowel(chars[j])) {
				j--;
			}

			// Swap vowels
			if (i < j) {
				char temp = chars[i];
				chars[i] = chars[j];
				chars[j] = temp;
				i++;
				j--;
			}
		}

		return new String(chars);
	}

	private static boolean isVowel(char c) {
		return "aeiouAEIOU".indexOf(c) != -1;
	}
}
