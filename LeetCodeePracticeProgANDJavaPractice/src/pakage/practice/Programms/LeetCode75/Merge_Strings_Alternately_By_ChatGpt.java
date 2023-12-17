package pakage.practice.Programms.LeetCode75;

public class Merge_Strings_Alternately_By_ChatGpt {

	public static void main(String[] args) {
		String word1 = "ab";
		String word2 = "pqrs";
		int length1 = word1.length();
		int length2 = word2.length();
		int maxLength = Math.max(length1, length2);
		StringBuilder merged = new StringBuilder();

		for (int i = 0; i < maxLength; i++) {
			if (i < length1) {
				merged.append(word1.charAt(i));
			}

			if (i < length2) {
				merged.append(word2.charAt(i));
			}
		}

		System.out.println(merged.toString());
	}
}
