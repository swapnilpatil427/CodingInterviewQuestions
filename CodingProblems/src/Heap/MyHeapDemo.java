package Heap;

public class MyHeapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHeap<Integer> heap = new MyHeap<Integer>();
		heap.insert(1);
		heap.insert(2);
		heap.insert(3);
		heap.insert(4);
		heap.insert(5);
		heap.insert(6);
		heap.print();
		int data = heap.delete();
	     data = heap.delete();
		heap.print();
	}

}
