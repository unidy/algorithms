package algorithms.c01;

public class C01 {

	/**
	 * Compute the greatest common divisor of two nonnegative integers p and q.
	 * @param p
	 * @param q
	 * @return
	 */
	public static int euclid(int p, int q) {
		if (q == 0) return p;
		
		int r = p % q;
		System.out.println(r);
		return euclid(q, r);
	}
}
