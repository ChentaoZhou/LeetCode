package linkedList;

public class ReverseList3 {
	public ListNode reverseList(ListNode head) {
	    if (head == null || head.next == null) return head;
	    ListNode p = reverseList(head.next);
	    System.out.println(p.val+" "+head.val);
	    head.next.next = head;
	    head.next = null;
	    return p;
	}
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2; node2.next = node3;
		node3.next = node4; node4.next = node5;
		new ReverseList3().reverseList(node1);
	}

}
