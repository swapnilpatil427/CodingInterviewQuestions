package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		Integer[] ia = { 30, 20, 10, 5, 6, 99 };
		BubbleSort.<Integer> bubble_srt(ia);
	}

	public static <T extends Comparable<T>> void bubble_srt(T array[]) {
		int n = array.length;
		int k;
		for (int m = n; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				if (array[i].compareTo(array[i + 1]) > 0) {
					T temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
	}
}
