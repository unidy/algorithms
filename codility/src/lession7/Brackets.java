package lession7;

import java.util.*;

public class Brackets {
    /**
     * Score: 100%
     */

    public int solution(String S) {
    	if (S == null || S.isEmpty()) {
    		return 1;
    	}
    	
    	char[] chars = S.toCharArray();
    	int n = chars.length;
    	
    	if (n > 200000) {
    		return 0;
    	}
    	
    	char[] stack = new char[n];
    	stack[0] = chars[0];
    	char c;
    	int j = 0;
    	for(int i = 1; i < n; i++) {
    		c = chars[i];
    		
    		if (j >= 0 &&  isPair(stack[j], c)) {
    			j--;
    		} else {
    			j++;
    			stack[j] = c;
    		}
    	}
    	
    	return j < 0 ? 1 : 0;
    }
    
    /**
     * Score: 
     * Issue: Timeout
     */
    public int solution1(String S) {
    	if (S == null || S.isEmpty()) {
    		return 1;
    	}
    	
    	Stack<String> stack = new Stack<>();
    	char[] chars = S.toCharArray();
    	int n = chars.length;
    	
    	if (n > 200000) {
    		return 0;
    	}
    	
    	char c = chars[0];
    	stack.push(String.valueOf(c));
    	for(int i = 1; i < n; i++) {
    		c = chars[i];
    		
    		if (!stack.isEmpty() &&  isPair(stack.peek().charAt(0), c)) {
    			stack.pop();
    		} else {
    			stack.push(String.valueOf(c));
    		}
    	}
    	
    	return stack.size() == 0 ? 1 : 0;
    }
    
    private boolean isPair(char c1, char c2) {
    	if ((c1 == '{' && c2 == '}')
    			|| (c1 == '[' && c2 == ']')
    			|| (c1 == '(' && c2 == ')')) {
    		return true;
    	}
    	
    	return false;
    }
}


/**
A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..200,000];
string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
Copyright 2009¨C2018 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

**/