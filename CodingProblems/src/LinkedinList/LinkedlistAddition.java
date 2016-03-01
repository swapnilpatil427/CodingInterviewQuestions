package LinkedinList;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class LinkedlistAddition {
	     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	         int carry = 0;
	         ListNode result = null;
	         ListNode head = result;
	         while(l1 != null && l2 != null ) {
	             ListNode temp = new ListNode((l1.val+l2.val+carry)%10);
	             carry = (l1.val+l2.val+carry)/10;
	             if(result == null) {
	                 result = temp;
	             } else {
	                 result.next = temp;
	                 result = result.next;
	             }
	             
	             l1 = l1.next;
	             l2 = l2.next;
	         }
	         
	         while(l1 != null) {
	                 ListNode temp = new ListNode((l1.val+carry)%10);
	                 result.next = temp;
	                 result = result.next;
	                 l1 = l1.next;
	         } 
	         while(l2 != null) {
	                 ListNode temp = new ListNode((l1.val+carry)%10);
	                 result.next = temp;
	                 result = result.next;
	                 l2 = l2.next;
	         }
	         
	         return head;
	     }
}
