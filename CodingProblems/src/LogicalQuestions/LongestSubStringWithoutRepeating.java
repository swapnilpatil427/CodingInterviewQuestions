package LogicalQuestions;

import java.util.HashSet;
import java.util.Set;
/* Given a string, find the length of the longest substring without repeating characters.
 *  For example, the longest substring without repeating letters for "abcabcbb" is "abc",
 *   which the length is 3. For "bbbbb" the longest substring is "b", 
 *   with the length of 1. 
 *   */
public class LongestSubStringWithoutRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mysolution";
		System.out.println(longestSubstringWithoutRepetetion(str));
		System.out.println(EfficientlongestSubstringWithoutRepetetion(str));
	}
	/* Non Efficient SOlution takes o(n2) */
	public static String longestSubstringWithoutRepetetion (String str) {
		StringBuilder sb = new StringBuilder(str);
		String out = "" ;
		int count = 0;
		Set<Character> set= new HashSet<Character>();
		
		for(int i = 0; i < sb.length()-1; i++) {
			set.clear();
			count = 0;
			String temp = "";
			while(!set.contains(sb.charAt(i+count)) && (i+count) < sb.length()-1) {
				set.add(sb.charAt(i+count));
				temp += sb.charAt(i+count);
				count++;
			}
			
			if(temp.length() > out.length()) {
				out = temp;
			}
		}
		return out;
	}
	
	/* Efficient solution O(n), uses dynamic programming
	 * needs extra buffer to store elements last occurance. */
	public static String EfficientlongestSubstringWithoutRepetetion (String str) {
		/* Stores the last occurance of the character,
		 * solution currently implemented for ASCII, 
		 * In case Unicode we can use hashMap. */ 
		int[] last = new int[256];
		for(int i = 0; i < 256; i++) {
			last[i] = -1;
		}
		int curLen = 1;
		int maxLen = 1;
		String out = "";
		int prevIndex;
		last[str.charAt(0)] = 0;
		for(int i = 1; i < str.length(); i++) {
			prevIndex = last[str.charAt(i)];
			if(prevIndex == -1 || prevIndex < (i - curLen)) {
				curLen++;
			} else {
				if(curLen > maxLen) {
					out = str.substring(i - curLen,i);
					maxLen = curLen;
				}
				
				curLen = i - prevIndex;
			}
			last[str.charAt(i)] = i;
		}
		if(curLen > maxLen) {
			maxLen = curLen;
		}
		System.out.println(maxLen);
		return out;
	}

}
