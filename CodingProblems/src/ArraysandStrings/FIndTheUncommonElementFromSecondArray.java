package ArraysandStrings;
import java.util.HashSet;
import java.util.Set;
/* Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 find which number is not present in the second array.*/
public class FIndTheUncommonElementFromSecondArray {

	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,4,5};
		Integer[] arr2 = {2,3,1,0,5};
		Integer i = FIndTheUncommonElementFromSecondArray.<Integer>returnUncommon(arr1, arr2);
		System.out.println(i);
	}
	
	/* Generic Implementation */
	public static <T> T returnUncommon(T[] arr1, T[] arr2) {
		Set<T> set = new HashSet<T>();
		/* Add Each element in the first array into the hashtset */
		for (int i = 0;i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		
		/* for each element in arr2 check if it exists in set, if not return that value */
		for(int i = 0;i < arr2.length; i++) {
			if(set.contains(arr2[i])) {
				continue;
			} else {
				return arr2[i];
			}
		}
		
		return null;
	}

}
