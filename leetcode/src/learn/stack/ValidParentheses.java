package learn.stack;

import java.util.*;

public class ValidParentheses {

	/*
	 * Regular Solution
	 */
	public boolean isValid(String s) {
		if (s == null || s.isEmpty()) {
			return true;
		}

		Stack<Character> stack = new Stack<>();

		Character c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			switch (c) {
			case ')':
				handleParentheses(stack, '(');
				break;
			case '}':
				handleParentheses(stack, '{');
				break;
			case ']':
				handleParentheses(stack, '[');
				break;
			default:
				stack.push(c);
				break;
			}
		}

		return stack.isEmpty();
	}

	private void handleParentheses(Stack<Character> stack, Character c) {
		if (!stack.isEmpty() && stack.peek() == c) {
			stack.pop();
		} else {
			stack.push(c);
		}
	}

	/*
	 * Saving space!
	 * 
	 * https://leetcode.com/explore/learn/card/queue-stack/230/usage-stack/1361/
	 * discuss/9178/Short-java-solution
	 * 
	 * Only push ')', '}' and ']' into stack.
	 * 
	 */
	public boolean isValid2(String s) {
		if (s == null || s.isEmpty()) {
			return true;
		}

		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}

}

/**
 * https://leetcode.com/explore/learn/card/queue-stack/230/usage-stack/1361/
 * 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets. Open brackets must
 * be closed in the correct order. Note that an empty string is also considered
 * valid.
 * 
 * Example 1:
 * 
 * Input: "()" Output: true Example 2:
 * 
 * Input: "()[]{}" Output: true Example 3:
 * 
 * Input: "(]" Output: false Example 4:
 * 
 * Input: "([)]" Output: false Example 5:
 * 
 * Input: "{[]}" Output: true
 **/
