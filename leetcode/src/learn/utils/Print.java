package learn.utils;

public class Print {

	public static void print(int[] arr) {
		print("[");
		
		for(int i=0; i<arr.length; i++) {
			if (i != 0) {
				print(", ");
			}
			print(arr[i]);
		}
		
		println("]");
	}
	
	public static void print(String[] arr) {
		print("[");
		
		for(int i=0; i<arr.length; i++) {
			if (i != 0) {
				print(", ");
			}
			print(arr[i]);
		}
		
		println("]");
	}
	
	private static void print(Object o) {
		System.out.print(o);
	}
	
	private static void println(Object o) {
		System.out.println(o);
	}
}
