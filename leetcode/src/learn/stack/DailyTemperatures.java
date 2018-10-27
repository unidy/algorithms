package learn.stack;

import java.util.*;

public class DailyTemperatures {

	/*
	 * Runtime: 343 ms
	 */
    public int[] dailyTemperatures(int[] T) {
        if (T.length == 0) {
        	return new int[0];
        }

        int[] list = new int[T.length];
        
        for (int i = 0; i < T.length - 1; i++) {
        	for (int j = i + 1; j < T.length; j++) {
        		if (T[j] > T[i]) {
        			list[i] = j - i;
        			break;
        		}
        	}
        }
        
        return list;
    }
    
	/*
	 * Runtime: 8 ms
	 */
    public int[] dailyTemperatures2(int[] T) {
    	int[] stack = new int[T.length];
        int top = -1;
        int[] ret = new int[T.length];
        for(int i = 0; i < T.length; i++) {
            while(top > -1 && T[i] > T[stack[top]]) {
                int idx = stack[top--];
                ret[idx] = i - idx;
            }
            stack[++top] = i;
        }
        return ret;
    }
    
    
    /**
     * Runtime: 71 ms
     * 
     * @param T
     * @return
     */
    public int[] dailyTemperatures3(int[] T) {
    	Stack<Integer> stack = new Stack<>();
    	int[] ret = new int[T.length];
    	
    	for(int i=0; i< T.length; i++) {
    		while(!stack.isEmpty() && T[i] > T[stack.peek()]) {
    			ret[stack.peek()] = i - stack.peek();
    			stack.pop();
    		}
    		stack.push(i);
    	}
    	
    	return ret;
    }

    /**
     * 
     * Runtime: 71 ms
     * 
     * Same with dailyTemperatures3 but just change the Stack to be int[]
     * 
     * @param T
     * @return
     */
    public int[] dailyTemperatures4(int[] T) {
    	int[] stack = new int[T.length];
    	int[] ret = new int[T.length];
    	
    	int top = -1;
    	for(int i=0; i< T.length; i++) {
    		while(top > -1 && T[i] > T[stack[top]]) {
    			ret[stack[top]] = i - stack[top];
    			top--;
    		}
    		stack[++top] = i;
    	}
    	
    	return ret;
    }
}

/**
https://leetcode.com/explore/learn/card/queue-stack/230/usage-stack/1363/

Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.

For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].

Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the range [30, 100].

**/
