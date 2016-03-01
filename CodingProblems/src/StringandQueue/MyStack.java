package StringandQueue;

public class MyStack<T> {
	int top;
	T[] stack;
	int size;
	
	public MyStack(int size) {
		stack =(T[]) new Object[size];
		top = -1;
	}
	
	boolean isEmpty () {
		if(top == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	void push(T data) {

		if(top == size-1) {
			System.out.println("Stack is full");
		} else {
			top++;
			stack[top] = data;
		}
	}
	
	T pop() {
		if(!isEmpty()) {
			T temp = stack[top];
			top--;
			return temp;
		} else {
			System.out.println("Stack is empty");
			return null;
		}
	}
}
