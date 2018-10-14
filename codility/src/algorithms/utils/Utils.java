package algorithms.utils;

public class Utils {

	/**
	 * Primility test
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int n) {
		if (n < 2) return false;
		
		for (int i = 2; i*i < n; i++) {
			if (n % i == 0) return false;
		}
		
		return true;
	}
	
	/**
	 * compute the square root.
	 * @param n
	 * @return
	 */
	public static double sqrt(double n) {
		if (n < 0) return Double.NaN;
		
		double err = 1e-15;
		double t = n;
		
		while (Math.abs(t - n/t) > err * t) {
			t = (n/t + t) /2.0;
		}
		
		return t;
	}
	

	public static void print(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(",");
		}
		System.out.println("");
	}
}
