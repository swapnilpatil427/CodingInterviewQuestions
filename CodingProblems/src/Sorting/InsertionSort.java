package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		Integer[] ia = { 30, 20, 10, 5, 6, 99 };
		InsertionSort.<Integer> insertionSort(ia);
	}

	public static <T extends Comparable<T>> void insertionSort(T[] input) {
		T temp;
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j].compareTo(input[j - 1]) < 0) {
					temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}
			}
		}
	}
}
