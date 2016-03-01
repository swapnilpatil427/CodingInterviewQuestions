package Sorting;

public class QuickSort {
	public static void main(String[] args) {
		Integer[] ia = { 30, 20, 10, 5, 6, 99 };
		QuickSort.<Integer> quicksort(ia, 0, ia.length - 1);
	}

	private static <T extends Comparable<T>> void quicksort(T[] arr, int low, int high) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		T pivot = arr[low + (high - low) / 2];

		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (arr[i].compareTo(pivot) < 0) {
				i++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (arr[j].compareTo(pivot) > 0) {
				j--;
			}

			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				T temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j)
			quicksort(arr, low, j);
		if (i < high)
			quicksort(arr, i, high);
	}
}
