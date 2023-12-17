package pakage.practice.Programms.LeetCode75;

public class Merge_Strings_Alternately_By_Sharanu {

	public static void main(String[] args) {
		String word1 = "ab";
		String word2 = "pqrs";
		int gret = 0;
		String merged = "";
		int length1 = word1.length();
		int length2 = word2.length();
		int maxlength = Math.max(length1, length2);
		if (length1 > length2) {
			gret = length1;
		} else if (length1 < length2) {
			gret = length2;
		} else if (length1 == length2) {
			gret = length2;
		}
		for (int i = 0; i < gret; i++) {
			try {
				merged = merged.concat(String.valueOf(word1.charAt(i)));
			} catch (Exception e) {
			}
			try {
				merged = merged.concat(String.valueOf(word2.charAt(i)));
			} catch (Exception e) {
			}
		}
		System.out.println(merged);
	}

}
