package learn.stack;

import java.util.*;

public class EvaluateReversePolishNotation {
	/*
	 * Runtime: 16 ms
	 */
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();

		int x, y;
		for (int i = 0; i < tokens.length; i++) {
			if (isOperand(tokens[i])) {
				y = stack.pop();
				x = stack.pop();
				stack.push(eval(x, y, tokens[i]));
			} else {
				stack.push(Integer.parseInt(tokens[i]));
			}
		}

		return stack.pop();
	}

	public int evalRPN2(String[] tokens) {
		int[] stack = new int[tokens.length];

		int x, y;
		int top = -1;
		for (int i = 0; i < tokens.length; i++) {
			if (isOperand(tokens[i])) {
				y = stack[top--];
				x = stack[top];
				stack[top] = eval(x, y, tokens[i]);
			} else {
				stack[++top] = Integer.parseInt(tokens[i]);
			}
		}

		return stack[0];
	}

	private boolean isOperand(String v) {
		switch (v) {
		case "+":
		case "-":
		case "*":
		case "/":
			return true;
		default:
			return false;
		}
	}

	private int eval(int x, int y, String opt) {
		switch (opt) {
		case "+":
			return x + y;
		case "-":
			return x - y;
		case "*":
			return x * y;
		default: // ="/"
			return Math.round(x / y);
		}
	}
}

/**
 * https://leetcode.com/explore/learn/card/queue-stack/230/usage-stack/1394/
 * 
 * RPN (Reverse Polish Notation):
 * https://en.wikipedia.org/wiki/Reverse_Polish_notation
 * https://baike.baidu.com/item/%E9%80%86%E6%B3%A2%E5%85%B0%E5%BC%8F/128437?fr=aladdin
 * 
 * 
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * 
 * Valid operators are +, -, *, /. Each operand may be an integer or another
 * expression.
 * 
 * Note:
 * 
 * Division between two integers should truncate toward zero. The given RPN
 * expression is always valid. That means the expression would always evaluate
 * to a result and there won't be any divide by zero operation. Example 1:
 * 
 * Input: ["2", "1", "+", "3", "*"] Output: 9 Explanation: ((2 + 1) * 3) = 9
 * Example 2:
 * 
 * Input: ["4", "13", "5", "/", "+"] Output: 6 Explanation: (4 + (13 / 5)) = 6
 * Example 3:
 * 
 * Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
 * Output: 22 Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5 = ((10 * (6 /
 * (12 * -11))) + 17) + 5 = ((10 * (6 / -132)) + 17) + 5 = ((10 * 0) + 17) + 5 =
 * (0 + 17) + 5 = 17 + 5 = 22
 * 
 */
