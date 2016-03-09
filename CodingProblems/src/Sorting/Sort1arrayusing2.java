package Sorting;

import java.sql.Time;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Sorting one array using ordering of other array'
 * for example str1 = banana, str2= bns 
 * output will be str1 one sorted using the str2 as foloows
 * output = bnnaaa   
 * 
 * input str1 = swapnil , str2 = npl
 * output = nplswai
 * */
public class Sort1arrayusing2 {
	static Map<Character, Integer> map = new HashMap<Character, Integer>();
	static int count;

	public static void main(String[] args) {
		/* String to be sorted */
		String s1 = "asdasdsafdhsfjshkfjhsdkjfcbsdjfhdshjkfksfhskfxdvsdhfskfhdfsjkds";
		/* Array to use for sorting sequence */
		String s2 = "awnswap";

		/* puts elements in array2, or characters in hashmap */
		for (int i = 0; i < s2.length(); i++) {
			map.put(s2.charAt(i), 0);
		}
		char[] c = s1.toCharArray();
		System.out.println("Original String : " + s1);
		System.out.println("Sorted String : " + sort1StringUsing2String(c, s2));
	}

	public static String sort1StringUsing2String(char[] s1, String s2) {
		long t = System.currentTimeMillis();
		StringBuilder s3 = new StringBuilder();
		StringBuilder s6 = new StringBuilder();
		for (int i = 0; i < s1.length; i++) {
			if (map.containsKey(s1[i])) {
				map.replace(s1[i], map.get(s1[i]) + 1);
			} else {
				s3.append(s1[i]);
			}
		}

		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			int value = map.get(c);
			for (int j = 0; j < value; j++) {
				s6.append(c);
			}
		}
		System.out.println("Time Taken by my algorithm : " + (System.currentTimeMillis() - t));
		return s6.append(s3).toString();
	}
}
