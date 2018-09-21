package lession6;

/**
 * Score: 56%
 * issue: Timeout
 * @author zhu
 *
 */
//TODO
public class NumberOfDiscIntersections {
    public static int solution(int[] A) {
    	if (A.length < 0 || A.length > 100000) {
    		return -1;
    	}
    	
    	int n = A.length;
        int count = 0;
    	long min, max, left, right;
    	for (int i=0; i < n - 1; i++) {
    		min = i - (long)A[i];
    		max = i + (long)A[i];
    		
    		for (int j = i+1; j < n; j++) {
    			left = j - (long)A[j];
    			right = j + (long)A[j];
    			
    			if (intersect(min, max, left, right)) {
    				System.out.print("(" + i + "," + j + "); ");
    				count++;
    				
    				if (count > 10000000) {
    					return -1;
    				}
    			}
    		}
    	}
    	
    	return count;
    }
    
    private static boolean intersect(long min, long max, long left, long right) {
    	if (left == min || left == max) return true;
    	if (right == min || right == max) return true;
    	
    	if (left > min && left < max) return true;
    	if (right > min && right < max) return true;
    	
    	if (left < min && right > max) return true;
    		
    	return false;
    }
}

/**
We draw N discs on a plane. The discs are numbered from 0 to N 鈭� 1. An array A of N non-negative integers, specifying the radiuses of the discs, is given. The J-th disc is drawn with its center at (J, 0) and radius A[J].

We say that the J-th disc and K-th disc intersect if J 鈮� K and the J-th and K-th discs have at least one common point (assuming that the discs contain their borders).

The figure below shows discs drawn for N = 6 and A as follows:

  A[0] = 1
  A[1] = 5
  A[2] = 2
  A[3] = 1
  A[4] = 4
  A[5] = 0


There are eleven (unordered) pairs of discs that intersect, namely:

discs 1 and 4 intersect, and both intersect with all the other discs;
disc 2 also intersects with discs 0 and 3.
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A describing N discs as explained above, returns the number of (unordered) pairs of intersecting discs. The function should return 鈭�1 if the number of intersecting pairs exceeds 10,000,000.

Given array A shown above, the function should return 11, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [0..2,147,483,647].

**/