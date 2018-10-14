package algorithms.c01;

public class BinarySearch {

	/**
	 * ¶ş·Ö²éÕÒ
	 * 
	 * return the index of the array whose value equals to key.
	 * 
	 * @param key
	 * @param a
	 * @return
	 */
	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;
		
		int mid = 0;
		while (lo <= hi) {
			mid = lo + (hi - lo) /2;
			if (key < a[mid]) {
				hi = mid - 1;
			}else if (key > a[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
}
