package ArraysandStrings;

class Stack<T>
{
	StackNode top=null;
	class StackNode{
		T data;
		StackNode next;
		public StackNode(T data)
		{
			this.data= data;
		}
	}
	
	void Push(T item)
	{
		if(top == null)
			top = new StackNode(item);
		else
		{
			StackNode temp = new StackNode(item);
			temp.next = top;
			top = temp;
		}
	}
	
	T pop()
	{
		StackNode Top = top;
		if(top.next !=null)
		top = top.next;
		else
		top = null;
		return Top.data;
	}
	Boolean isEmpty()
	{
		if(top == null)
			return true;
		else
			return false;
	}
	void Print()
	{
		while(top != null)
		{
			System.out.println(pop());
		}
	}
}

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack<Integer> s = new Stack<Integer>();
			s.Push(2);
			s.Push(3);
			s.Push(4);
			s.Push(5);
			s.Print();
	}

}
