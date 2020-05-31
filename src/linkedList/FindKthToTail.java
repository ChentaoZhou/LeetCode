package linkedList;

import java.util.Stack;

public class FindKthToTail {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	 public ListNode FindKthToTail(ListNode head,int k) {
		 if(head == null) return null;
		 if(k==0) return null;
		 Stack<ListNode> nodes = new Stack<ListNode>();
		 while(head!=null) {
			 nodes.push(head);
			 head = head.next;
		 }
		 if(nodes.size()<k) return null;
		 for(int i=0;i<k-1;i++) nodes.pop();
		 return nodes.pop();
		 
	 }
	 public ListNode FindKthToTail2(ListNode head, int k) {
		 ListNode p, q;
		 p=head;q=head;
		 int i=0;
		 for(;p!=null;i++) {
			 if(i>=k) {
				 q = q.next;
			 }
			 p=p.next;
		 }
		 return i<k ? null:q;
	 }
}
