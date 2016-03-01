package Tree;
class TreeList {
	Node root;
	
	public TreeList () {
		root = null;
	}
	
	class Node {
		int data;
		Node left;
		Node right;
		
		public Node (int data) {
			this.data = data;
		}
	}
	
	void inOrder (Node root) {
		if(root != null) {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		} 
	}
	
	void print() {
		inOrder(root);
	}
	
	void search(int data) {
		
	}
	
	void delet(int data) {
		Node node = root;
		Node previous = root;
		while (node !=null) {
			if (node.data == data) {
				break;
			} else if(node.data > data) {
				previous = node;
				node = node.left;
			} else {
				previous = node;
				node = node.right;
			}
		}
		
		if(node == null) {
			System.out.println("no data found");
		} else if(node.left == null && node.right == null) {
			previous.left = null;
			previous.right = null;
		} else if(node.right == null) {
			if(previous.data > node.data) {
				previous.left = node.left;
			} else {
			    previous.right = node.left;
			}
		} else if(node.left == null) {
			if(previous.data > node.data) {
				previous.left = node.right;
			} else {
			    previous.right = node.right;
			}
		}
		else {
			Node current = node;
			node = node.right;
			
			if(node.left == null) {
				current.data = node.data;
				current.right = node.right;
			} else {
				//previous = node;
				while(node.left != null) {
					previous = node;
					node = node.left;
				}
				if(current.data > node.data) {
					current.data = node.data;
					
				} else {
					current.data = node.data;
				}
				
				previous.left = null;
			}
			

		}
		
		 System.out.println("Deleted");
	}
	
	void add (int data) {
		Node temp = new Node(data);
		Node node = root;
		if(root == null) {
			root = temp;
		} else {
			while (node != null) {
				if(node.data > data) {
					if(node.left == null) {
						node.left = temp;
						break;
					} else {
						node = node.left;
					}
				} else {
					if(node.right == null) {
						node.right = temp;
						break;
					} else {
						node = node.right;
					}
				}
			}
		}
	}
}


public class TreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeList t = new TreeList();
			t.add(15);
			t.add(10);
			t.add(13);
			t.add(14);
			t.add(12);
			t.add(5);
			t.add(3);
			t.add(8);
			t.add(6);
			t.add(9);
			t.add(4);
			t.add(2);
			t.add(20);
			t.add(18);
			t.add(25);
			t.add(16);
			t.add(19);
			t.add(24);
			t.add(26);
		//	t.print();
		    t.delet(18);
		    t.delet(15);
		  //  t.delet(5);
		  // t.delet(20);
		   // t.delet(19);
		    t.print();
	}

}
