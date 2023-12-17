package pakage.practice.Programms.LeetCode;

import java.util.Stack;

public class ValidParentheses {

	public static boolean conf;
	public boolean isValid(String s) {
		// Create an empty stack to keep track of opening brackets
		Stack<Character> stack = new Stack<Character>();

		// Loop through every character in the string
		for (char c : s.toCharArray()) {
			// If the character is an opening bracket, push it onto the stack
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else { // If the character is a closing bracket
				// If the stack is empty, there is no matching opening bracket, so return false
				if (stack.isEmpty()) {
					return false;
				}
				// Otherwise, get the top of the stack and check if it's the matching opening
				// bracket
				char top = stack.peek();
				if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
					// If it is, pop the opening bracket from the stack
					stack.pop();
				} else { // Otherwise, the brackets don't match, so return false
					return false;
				}
			}
		}
		// If the stack is empty, all opening brackets have been closed, so return true
		// Otherwise, there are unmatched opening brackets, so return false
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 conf = new ValidParentheses().isValid("()[]{}");
		System.out.println(conf);
		
		conf = new ValidParentheses().isValid("(]");
		System.out.println(conf);
	}

}
