package ArraysandStrings;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "We promptly judged antique ivory buckles for the prize";
		int checker = 0;
		int temp = 0;
		int count = 0;
		s = s.toLowerCase();
		for(int i=0; i < s.length(); i++) {
			int c = s.charAt(i) - 97;
			checker = checker | (1 << (c+1));
			if((checker^temp) != 0 && c < 26 && c >=0) {
				count++;
			}
			temp = checker;
		}
		if(count >= 26) {
			System.out.println("pangram");
		} else {
			System.out.println("Not Pangram");
		}
	}
}
