package LinkedList;

import java.util.ArrayList;

public class ReverseLsit {
	public ListNode ReverseList(ListNode head) {
		if(head == null) return null;
		ListNode node = head.next;
		head.next =null;
		
		while(node!=null) {
			ListNode nextNode = node.next;
			node.next = head;
			head = node;
			node = nextNode;
		}
		return head;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public ListNode ReverseList(ListNode head) {
//		if(head == null) return null;
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		while (head != null) {
//			a.add(0, head.val);
//			head = head.next;
//		}
//		ListNode first = new ListNode(a.get(0));
//		ListNode last = first;
//		for(int i=1;i<a.size();i++) {
//			ListNode carry = new ListNode(a.get(i));
//			last.next = carry;
//			last = carry;
//		}
//		return first;
//	}
}
