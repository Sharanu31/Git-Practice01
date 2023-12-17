package pakage.practice.Programms.LeetCode75;

public class Reverse_Words_In_A_String_By_ChatGpt {

	public static void main(String[] args) {

		String s = "the sky is blue";
		new Reverse_Words_In_A_String_By_ChatGpt().reverseWords(s);
		s = "  hello world  ";
		new Reverse_Words_In_A_String_By_ChatGpt().reverseWords(s);
		s = "a good   example";
		new Reverse_Words_In_A_String_By_ChatGpt().reverseWords(s);
		s = "EPY2giL";
		new Reverse_Words_In_A_String_By_ChatGpt().reverseWords(s);

	}

	public String reverseWords(String s) {
		// Trim the input string to remove leading and trailing spaces
		String[] str = s.trim().split("\\s+");

		// Initialize the output string
		String out = "";

		// Iterate through the words in reverse order
		for (int i = str.length - 1; i > 0; i--) {
			// Append the current word and a space to the output
			out += str[i] + " ";
		}

		// Append the first word to the output (without trailing space)
		System.out.println(out + str[0]);
		return out + str[0];
	}
}
