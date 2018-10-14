package Tasks1;

import java.util.Arrays;

public class Task1 {

	public static void Test(){
		int n = 213;
		
		System.out.println(solution(n));
	}
	
	public static int solution(int N) {
		String str 		= new Integer(N).toString(); 
		char[] chars 	= str.toCharArray(); 
		Arrays.sort(chars);
		
		String reverseStr 	= new StringBuilder(new String(chars)).reverse().toString();

		return Integer.parseInt(reverseStr); 
	}
}
