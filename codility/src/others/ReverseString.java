package others;

public class ReverseString {

	public String solution(String A) {
		StringBuffer r = new StringBuffer();
		
		for(int i = A.length() - 1; i >= 0; i--) {
			r.append(String.valueOf(A.charAt(i)));
		}
		
		return r.toString();
	}
}
