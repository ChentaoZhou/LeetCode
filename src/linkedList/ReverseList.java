package linkedList;

import java.util.Stack;

public class ReverseList {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public ListNode ReverseList2(ListNode head) {
		if(head == null) return null;
		Stack<ListNode> nodes = new Stack<ListNode>();
		while(head!=null) {
			nodes.push(head);
			head = head.next;
		}
		ListNode result = nodes.pop();
		ListNode nextNode = result;
		while(!nodes.isEmpty()) {
			nextNode.next = nodes.pop();
			nextNode = nextNode.next;
		}
		nextNode.next = null;
		return result;
    }
	public ListNode ReverseList(ListNode head) {
		if(head==null) return null;
		ListNode nextNode = head.next;
		head.next = null;
		while(nextNode!=null) {
			ListNode temp = nextNode.next;
			nextNode.next = head;
			head = nextNode;
			nextNode = temp;
			
		}
		return head;
	}
}






