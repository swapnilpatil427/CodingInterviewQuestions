package ArraysandStrings;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two strings s and t, determine if they are isomorphic. Two strings are 
   if the characters in s can be replaced to get t.

    For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
 */

public class IsomorphicString {

	public static void main(String[] args) {
		System.out.println(CheckIfIsomorphic("foo","bar"));
	} 
	
	public static Boolean CheckIfIsomorphic(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
				
		Map<Character, Character> mapKeyValue = new HashMap<Character, Character>();
		Map<Character, Character> mapValueKey = new HashMap<Character, Character>();
		for(int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			Character c = null;
			if(mapValueKey.containsKey(c2)) {
				c = mapValueKey.get(c2);
			}
			
			if(c != null && c != c1) {
				return false;
			} else if(mapKeyValue.containsKey(c1)) {
				if(mapKeyValue.get(c1) != c2) {
					return false;
				}
			} else {
				mapKeyValue.put(c1, c2);
				mapKeyValue.put(c2, c1);
			}	
		}
		
		return true;
	}

}
