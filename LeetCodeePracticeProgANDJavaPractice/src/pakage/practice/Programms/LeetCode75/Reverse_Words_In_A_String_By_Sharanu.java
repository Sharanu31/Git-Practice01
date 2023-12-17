package pakage.practice.Programms.LeetCode75;

public class Reverse_Words_In_A_String_By_Sharanu {

	public static void main(String[] args) {
		String s = "the sky is blue";
		new Reverse_Words_In_A_String_By_Sharanu().reverseWords(s);
		s = "  hello world  ";
		new Reverse_Words_In_A_String_By_Sharanu().reverseWords(s);
		s = "a good   example";
		new Reverse_Words_In_A_String_By_Sharanu().reverseWords(s);
		s = "EPY2giL";
		new Reverse_Words_In_A_String_By_Sharanu().reverseWords(s);

	}

	public String reverseWords(String s) {

		String value = s.trim();
		String[] value1 = value.split(" ");
		String finalValue = "";
		int count = 1;
		for (int i = 0; i < value1.length; i++) {
			if (!value1[value1.length - count].isEmpty()) {
				finalValue = finalValue.trim();
				finalValue = finalValue + " " + value1[value1.length - count].trim();
				finalValue = finalValue.trim();
				count++;
			} else {
				count++;
			}
		}
		System.out.println(finalValue.trim());
		return finalValue;

	}
}
