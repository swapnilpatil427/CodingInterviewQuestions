package ArraysandStrings;

import java.util.Arrays;

public class permutationstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "swap";
		String s2 = "paws";
		if(s1.length() != s2.length())
			System.out.println("Not permutation");
		Arrays.sort(s1.toCharArray());
		Arrays.sort(s2.toCharArray());
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
