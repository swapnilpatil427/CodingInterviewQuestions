package Heap;

public class MyHeap<T extends Comparable<T>> {
	T[] heapArray;
	int lastElement;
	final float loadFactor = 0.75f ;
	public MyHeap() {
		heapArray = (T[]) new Comparable[2];
		lastElement = 0;
	}
	
	public void print() {
		for(int i = 0; i < lastElement;i++) {
			System.out.println(heapArray[i]);
		}
	}
	
	public void insert(T data) {
		int indexChild;
		int indexParent;
		if(lastElement >= (heapArray.length -1 * loadFactor )) {
			doubleArraySize();
		} 
			heapArray[lastElement] = data;
			indexChild = lastElement;
			indexParent = (indexChild - 1) / 2;
			lastElement++;
			while(indexParent >= 0) {
				if(heapArray[indexChild].compareTo(heapArray[indexParent]) > 0) {
					T temp = heapArray[indexChild];
					heapArray[indexChild] = heapArray[indexParent];
					heapArray[indexParent] = temp;
					indexChild = indexParent;
					indexParent = (indexChild - 1) / 2;
				} else {
					break;
				}
			}
		
	}
	
	public T delete() {
		
		if(lastElement == 0) {
			System.out.println("Heap Empty");
			return null;
		}
		int indexParent = 0;
		int indexChildLeft = 2 * indexParent + 1;
		T data = heapArray[indexParent];
		heapArray[indexParent] = heapArray[lastElement - 1];
		lastElement--;
		while(indexChildLeft < lastElement) {
			int max = 0;
			if(indexChildLeft + 1>= lastElement) {
				if(heapArray[indexParent].compareTo(heapArray[indexChildLeft]) < 0)
					  max = indexChildLeft;
				else 
					break;
			} else {
				if(heapArray[indexChildLeft].compareTo(heapArray[indexChildLeft + 1]) > 0) {
					if(heapArray[indexParent].compareTo(heapArray[indexChildLeft]) < 0)
					  max = indexChildLeft;
				} else {
					if(heapArray[indexParent].compareTo(heapArray[indexChildLeft + 1]) < 0)
					  max = indexChildLeft + 1;;
				}
				
					
			}
			
			if(max == indexParent){ 
				return data;
			} else {
				T temp = heapArray[indexParent];
				heapArray[indexParent] = heapArray[max];
				heapArray[max] = temp;
				indexParent = max;
				indexChildLeft = 2 * indexParent + 1;
			}		
		}
		
		return data;
	}
	
	void doubleArraySize() {
		T[] temp = (T[]) new Comparable[heapArray.length * 2];
		for(int i = 0; i < heapArray.length; i++) {
			temp[i] = heapArray[i];
		}
		
		heapArray = temp;
	}
	
}
