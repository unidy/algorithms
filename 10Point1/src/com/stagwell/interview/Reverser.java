package com.stagwell.interview;

import java.util.*;

/**
 * Given an integer, return the integer with descending order.
 * For example:
 * Input: 
 * 		213
 * Output:
 *		321
 */
public class Reverser {

	public int solution(int N) {
		String str 		= new Integer(N).toString(); 
		char[] chars 	= str.toCharArray(); 
		Arrays.sort(chars);
		
		String reverseStr 	= new StringBuilder(new String(chars)).reverse().toString();

		return Integer.parseInt(reverseStr); 
	}
}
