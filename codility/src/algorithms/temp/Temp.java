package algorithms.temp;

import java.util.HashSet;

public class Temp {

	public int[] merge(int[] A, int[] B) {
		int[] merged = new int[A.length + B.length];
		
		int i = 0, j = 0, k = 0;
		while (i < A.length || j < B.length) {
			merged[k++] = A[i] < B[j] ? A[i++] : B[j++];
			
			if (i == A.length) {
				while (j < B.length) {
					merged[k++] = B[j++];
				}
				break;
			}
			
			if (j == B.length) {
				while (i < A.length) {
					merged[k++] = A[j++];
				}
				break;
			}
		}
		
		return merged;
	}
	
	public int duplicates(int[] A) {
		if (A == null || A.length == 1) {
			return 0;
		}
		
		HashSet<Integer> set = new HashSet<>();
		int count = 0;
		int duplicates = 0;
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
			if (set.size() == count) {
				duplicates++;
			} else {
				count = set.size();
			}
		}
		
		return duplicates;
	}
	
	public int duplicates2(int[] A) {
		if (A == null || A.length == 1) {
			return 0;
		}
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i < A.length; i++) {
			set.add(A[i]);
		}
		
		return A.length - set.size();
	}
	
}
