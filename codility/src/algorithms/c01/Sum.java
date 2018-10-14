package algorithms.c01;

import java.util.Arrays;

public class Sum {

	/**
	 * Return the number of pairs of integers in an array that sum to 0.
	 * 
	 * @param a
	 * @return
	 */
	public static int twoSum(int[] a) {
		Arrays.sort(a);
		
		int N = a.length;
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			if (BinarySearch.rank(-a[i], a) > i) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static int threeSum(int[] a) {
		Arrays.sort(a);
		
		int N = a.length;
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				if (BinarySearch.rank(-a[i] - a[j], a) > j) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}
}
