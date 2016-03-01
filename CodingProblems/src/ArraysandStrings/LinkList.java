package ArraysandStrings;

import java.util.HashSet;

class LinkListDS<T> {
	Node first;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	void add(T data)
	{
		Node n = new Node(data);
		if(first == null)
		{
			first = n;
		}
		else
		{
			Node head = first;
			while(head.next !=null)
			{
				
				head = head.next;
			}
			head.next = n;
		}
	}
	
	void RemoveDuplicates()
	{
		HashSet<Integer> data =new HashSet<Integer>();
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
					data.add((Integer) node.data);
					prev = node;
				}
				
				node = node.next;
				//print();
				//System.out.println("next iteration");
			}		
	}
	
	void print()
	{
		Node head = first;
		while(head !=null)
		{
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	private class Node{
			T data;
			Node next;
			public Node(T d)
			{
				this.data = d;
			}
		}
	
	}

public class LinkList
{
	public static void main(String[] arg)
	{
		LinkListDS<Integer> ll = new LinkListDS<Integer>();
//		Node s = new Node(2);
		ll.add(1);
//	
		ll.add(2);
		ll.add(2);
		ll.add(3);
		ll.add(2);
		ll.add(2);
//		s = new Node(4);
//		ll.add(new Node(4));
		//ll.print();
		ll.add(2);
		ll.add(2);
		ll.add(3);
		ll.add(2);
		ll.add(2);
		ll.add(2);
		ll.add(2);
		ll.add(3);
		ll.add(2);
		ll.add(2);
		ll.RemoveDuplicates();
		ll.print();
	}
}
