package StringandQueue;

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
	static Map<Character,Integer> map = new HashMap<Character,Integer>();
	static Map<Integer,Character> map1 = new HashMap<Integer,Character>();
	static int count;
	private static char[] array;
    private static char[] tempMergArr;
    private static int length;
    private static char[] numbers;
    private static int number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "swapnilpatil";
		String s2 = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(s1.length());
		for(int i = 0; i < s2.length(); i++) {
			map.put(s2.charAt(i), i);
			map1.put(i,s2.charAt(i));
		}
		char[] c = s1.toCharArray();
	    System.out.println("Original String : " + s1);
	    System.out.println("Sorted String : " + sortString(c));
	   
	    
	    sort(c);
            System.out.println(String.valueOf(array));
	    
        
        char[] c1 = s1.toCharArray();
        long t = System.currentTimeMillis();
        sort1(c1);
        System.out.println(System.currentTimeMillis() - t);
        System.out.println(String.valueOf(numbers));
        t = System.currentTimeMillis();
        bubble_srt(c1);
        char[] c2 = s1.toCharArray();
        char[] arr2 = doInsertionSort(c2);
        System.out.println(System.currentTimeMillis() - t);
        System.out.println(String.valueOf(arr2));
        
        t = System.currentTimeMillis();
        bubble_srt(c1);
        System.out.println(System.currentTimeMillis() - t);
        System.out.println(String.valueOf(c1));
        
        t = System.currentTimeMillis();
        char[] c4 = s1.toCharArray();
        Arrays.sort(c4);
        //bubble_srt(c1);
        System.out.println(System.currentTimeMillis() - t);
        System.out.println(String.valueOf(c4));
        
        
	   // System.out.println("Merge Sorted" + String.valueOf(s1.toCharArray()) );
	    
	}
	public static char[] doInsertionSort(char[] input){
        
        char temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }

	 public static void bubble_srt(char array[]) {
	        int n = array.length;
	        int k;
	        for (int m = n; m >= 0; m--) {
	            for (int i = 0; i < n - 1; i++) {
	                k = i + 1;
	                if (array[i] > array[k]) {
	                    swapNumbers(i, k, array);
	                }
	            }
	        }
	    }
	  
	    private static void swapNumbers(int i, int j, char[] array2) {
	  
	        char temp;
	        temp = array2[i];
	        array2[i] = array2[j];
	        array2[j] = temp;
	    }

	
	 public static void sort1(char[] values) {
		    // check for empty or null array
		    if (values ==null || values.length==0){
		      return;
		    }
		    numbers = values;
		    number = values.length;
		    quicksort(0, number - 1);
		  }

		  private static void quicksort(int low, int high) {
		    int i = low, j = high;
		    // Get the pivot element from the middle of the list
		    int pivot = numbers[low + (high-low)/2];

		    // Divide into two lists
		    while (i <= j) {
		      // If the current value from the left list is smaller then the pivot
		      // element then get the next element from the left list
		      while (numbers[i] < pivot) {
		        i++;
		      }
		      // If the current value from the right list is larger then the pivot
		      // element then get the next element from the right list
		      while (numbers[j] > pivot) {
		        j--;
		      }

		      // If we have found a values in the left list which is larger then
		      // the pivot element and if we have found a value in the right list
		      // which is smaller then the pivot element then we exchange the
		      // values.
		      // As we are done we can increase i and j
		      if (i <= j) {
		        exchange(i, j);
		        i++;
		        j--;
		      }
		    }
		    // Recursion
		    if (low < j)
		      quicksort(low, j);
		    if (i < high)
		      quicksort(i, high);
		  }

		  private static void exchange(int i, int j) {
		    char temp = numbers[i];
		    numbers[i] = numbers[j];
		    numbers[j] = temp;
		  }
	


	
	
	public static void sort(char inputArr[]) {
		long t = System.currentTimeMillis();
        array = inputArr;
        length = inputArr.length;
        tempMergArr = new char[length];
        doMergeSort(0, length - 1);
        System.out.println(System.currentTimeMillis() - t);
    }
 
    private static void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private static void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
    }
	
	static String sortString(char[] s1) {
		long t = System.currentTimeMillis();
		StringBuilder s3 = new StringBuilder();
		StringBuilder s6 = new StringBuilder();
        int[] values = new int[map.size()];
        char c; 
        int priority;
	    for(int i = 0; i < s1.length; i++) {
	    	c = s1[i];
	    	priority = priority(c);
	    	if(priority < map.size()) {
	    		values[priority]++;
	    	} else {
	    		s3.append(c);
	    	}
	    }

	    for(int i = 0; i < map.size(); i++) {
	    	if(values[i] != '\u0000') {
	    		char value = map1.get(i);
	    	    for(int j=0;j<values[i];j++) {
	    	    	s6.append(value);
	    	    }
	    	}
	    }  
	    System.out.println(System.currentTimeMillis() - t);
	    return s6.append(s3).toString();
	}
	
	static int priority(char c) {
		return (map.containsKey(c))? map.get(c) : map.size();
	}

}
