package pakage.practice.Programms.LeetCode75;

import java.util.ArrayList;
import java.util.List;

public class Reverse_Vowels_of_a_String_By_Sharanu {

	public static void main(String[] args) {
		String s = "";
		s = "hello";
		System.out.println( new Reverse_Vowels_of_a_String_By_Sharanu().reverseVowels(s));
		s = "leetcode";
		System.out.println(new Reverse_Vowels_of_a_String_By_Sharanu().reverseVowels(s));
	}

	public String reverseVowels(String s) {
		int count = 1;
		String finValue = "";
		String[] splitValue = s.split("");
		List<String> values = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			boolean val1 = new Reverse_Vowels_of_a_String_By_Sharanu().vowelsValue(splitValue[i]);
			if (val1 == true) {
				values.add(splitValue[i]);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			boolean val1 = new Reverse_Vowels_of_a_String_By_Sharanu().vowelsValue(splitValue[i]);
			if (val1 == true) {
				finValue = finValue + values.get(values.size() - count);
				count++;
			} else {
				finValue = finValue + splitValue[i];
			}
		}
		return finValue;
	}

	boolean vowelsValue(String strVal) {
		String[] vowels = { "a", "e", "i", "o", "u" };
		for (String vowel : vowels) {
			if (vowel.equalsIgnoreCase(strVal)) {
				return true;
			}
		}
		return false;

	}

}
