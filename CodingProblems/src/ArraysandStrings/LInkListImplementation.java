package ArraysandStrings;

import java.util.HashSet;



class LinkList1<T>{
	Node first;
	int count;
	Node last;
	class Node
	{
	    Node next;
	    T data;
	    Node(T d)
	    {
	    	this.data = d;
	    }
	}
	
	void add(T data)
	{
		Node temp = new Node(data);
		if(first == null)
		{
			first = temp;
			last = temp;
			
		}
		else
		{
			last.next = temp;
			last = temp;
		}
	}
	
	void Print()
	{
		Node temp = first;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	
	T KthElement(int index)
	{
		Node position1 = first;
		Node position2 = first;
		for(int i=0;i<index;i++)
		{
			position2 = position2.next;
		
		}
		
		
		while(position2 != null)
		{
			position2 = position2.next;
			position1 = position1.next;
		}
		
		return position1.data;
	}
	
	void RemoveDuplicates()
	{
		HashSet<T> data =new HashSet<T>();
			Node node = first;
			Node prev = first;
			while(node != null)
			{			
				if(data.contains(node.data))
				{	
					
					prev.next = node.next;
					//node = node.next;
				
				}
				else
				{				
					data.add((T) node.data);
					prev = node;
				}
				
				node = node.next;
				//print();
				//System.out.println("next iteration");
			}		
	}
	void Partition(T x)
	{
		Node head=first;
		Node tail = first;
		Node temp = head;
		while(temp != null)
		{
			Node next = temp.next;
			if(Integer.parseInt(temp.data.toString()) < Integer.parseInt(x.toString()))
			{
				temp.next= first;
				head = temp;
			}
			else
			{
				tail.next = temp;
				tail = temp;
			}	
			temp = next;
		}
		tail.next = null;
		
		first = head;
	}
}

public class LInkListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList1<Integer> ll = new LinkList1<Integer>();
		ll.add(1);
	//	
			ll.add(2);
			ll.add(2);
			ll.add(3);
			ll.add(4);
			ll.add(5);
//			s = new Node(4);
//			ll.add(new Node(4));
			//ll.print();
			ll.add(5);
			ll.add(6);
			ll.add(7);
			ll.add(8);
			ll.add(9);
			ll.add(10);
			ll.add(2);
			ll.add(3);
			ll.add(5);
			ll.add(4);
		//ll.RemoveDuplicates();
		//ll.Print();
		//System.out.println(ll.KthElement(4));
		ll.Partition(5);
		ll.Print();
	}

	
}
