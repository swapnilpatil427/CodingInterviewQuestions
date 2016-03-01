package StringandQueue;

class LinkedListQueue<T> {
	Node rear;
	Node front;
	
	public LinkedListQueue() {
		rear = null;
		front = null;
	}
	
	boolean isEmpty() {
		if(front == null && rear == null) {
			return true;
		} else {
			return false;
		}
	}
	
	void enQueue(T val) {
		if(isEmpty()){
			Node node = new Node(val);
			node.next = null;
			rear = node;
			front = node;
		} else if (rear.next == front) {
			System.out.println("Queue is full");
		} else {
			rear = rear.next;
			Node node = new Node(val);
			node.next = null;
			rear = node;
		}
	}
	
	T deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			throw new IllegalStateException("Queue is empty, cant dequeue");
		}
		else {
			Node node = front;
			front = front.next;
			return node.data;
		}
	}
	
	class Node
	{
		Node next;
		T data;
		
		public Node(T data) {
			this.data = data;
		}
	}
}

public class QueueLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListQueue newQueue = new LinkedListQueue<Integer>();
	        newQueue.enQueue(10);
	        newQueue.enQueue(20);
	        newQueue.enQueue(30);
	        newQueue.enQueue(40);
	        newQueue.enQueue(50);
	        System.out.println(newQueue.deQueue());
	        System.out.println(newQueue.deQueue());
	        System.out.println(newQueue.deQueue());
	        System.out.println(newQueue.deQueue());
	        newQueue.enQueue(60);
	        newQueue.enQueue(70);
	        System.out.println(newQueue.deQueue());
	        System.out.println(newQueue.deQueue());
	        System.out.println(newQueue.deQueue());
	}

}
