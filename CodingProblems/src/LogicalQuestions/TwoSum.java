package LogicalQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Given an array of integers, return indices of the two numbers such 
 * that they add up to a specific target.
 * You may assume that each input would have exactly one solution.

 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the Input Size");
		int size = sc.nextInt();
		int[] input = new int[size];
		for(int i = 0;i < size; i++) {
			System.out.println("Enter the number to add");
			int number = sc.nextInt();
			input[i] = number;
		}
		System.out.println("Enter the Target");
		int target = sc.nextInt();
		int[] result = twoSum(input,target);
		System.out.println("Start:"+result[0]+"\t end:"+result[1]);
	}
	
	public static int[] twoSum(int[] input,int target) {
		Map<Integer,Integer> numMap = new HashMap<Integer,Integer>();
		int[] result = new int[2];
		for(int i = 0; i < input.length; i++) {
			if(numMap.containsKey(input[i])) {
				int index = numMap.get(input[i]);
				result[0] = index;
				result[1] = i;
			} else {
				numMap.put(target - input[i], i);
			}
		}
		
		return result;
	}
}
