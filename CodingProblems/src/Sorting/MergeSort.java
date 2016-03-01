package Sorting;

public class MergeSort {
	public static void main(String[] args) {
		Integer[] ia = { 30, 20, 10, 5, 6, 99 };
		MergeSort.<Integer> MergeSort(ia, 0, ia.length - 1);
	}

	private static <T extends Comparable<T>> void MergeSort(T[] arr, int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			MergeSort(arr, lowerIndex, middle);
			// Below step sorts the right side of the array
			MergeSort(arr, middle + 1, higherIndex);
			// Now merge both sides
			MergeSort.<T> mergeParts(arr, lowerIndex, middle, higherIndex);
		}
	}

	private static <T extends Comparable<T>> void mergeParts(T[] arr, int lowerIndex, int middle, int higherIndex) {
		T[] tempMergArr = (T[]) new Comparable[arr.length];
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = arr[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i].compareTo(tempMergArr[j]) <= 0) {
				arr[k] = tempMergArr[i];
				i++;
			} else {
				arr[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			arr[k] = tempMergArr[i];
			k++;
			i++;
		}
	}
}
