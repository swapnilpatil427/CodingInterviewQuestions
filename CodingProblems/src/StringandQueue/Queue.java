package StringandQueue;

class Queuerray<T> {
	int front;
	int rear;
	T[] queue;
	int size;
	
	public Queuerray(int size) {
		 this.size = size;
		 queue = (T[]) new Object[size];
		 front = -1;
		 rear = -1;
	}
	
	public boolean isEmpty()
	{
		if(front == -1 && rear == -1) {
			return true;
		} else
			return false;
	}
	
	public void enQueue(T val) {
		if(rear + 1 % size == front) {
			System.out.println("Queue is full");
		}
		
		if(isEmpty()) {
			front = 0;
			rear = 0;
			queue[rear] = val;
		} else {
			rear = (rear + 1) % size;
			queue[rear] = val;			
		}		
	}
	
	public T deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			throw new IllegalStateException("Queue is empty, cant dequeue");
		} else if(front == rear) {
			T val = queue[front];
			front = -1;
			rear = -1;
			return val;
		}
		else {
			T val = queue[front];
			front = (front+1)%size;
			return val;
		}	
	}
}

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queuerray newQueue = new Queuerray<Integer>(5);
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
