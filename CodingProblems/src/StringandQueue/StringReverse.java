package StringandQueue;

public class StringReverse {
	static String reverse(String s) {
		if(s.length() == 1) {
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Swapnil";
		System.out.println(s);
		System.out.println(reverse(s));
	}

}
