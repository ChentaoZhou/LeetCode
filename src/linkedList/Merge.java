package linkedList;

public class Merge {
	
	 public static ListNode Merge2(ListNode list1,ListNode list2) {
		 if(list1 == null) return list2;
		 if(list2 == null) return list1;
		 ListNode head = null, curr=null;
		 
		 while(list1!=null && list2!=null) {
			 if(list1.val<=list2.val) {
				 if(head == null) {
					 head = list1;
					 curr = list1;
				 }else {
					 curr.next = list1;
					 curr = curr.next;
				 }
				 list1 = list1.next;
			 }else {
				 if(head == null) {
					 head = list2;
					 curr = list2;
				 }else {
					 curr.next = list2;
					 curr = curr.next;
				 } 
				 list2 = list2.next;
			 }
		 }
		 if(list1!=null) {
			 curr.next = list1;
		 }
		 if(list2!=null) {
			 curr.next = list2;
		 }
		 return head; 
	 }
	 
	 public static ListNode Merge(ListNode list1,ListNode list2) {
		 if(list1 == null) return list2;
		 if(list2 == null) return list1;
		 
		 if(list1.val <= list2.val) {
			 list1.next = Merge(list1.next, list2);
			 return list1;
		 }else {
			 list2.next = Merge(list1, list2.next);
			 return list2;
		 }
	 }

		 
	 public static void main(String[] args) {
		 ListNode nod1 = new ListNode(2);
		 ListNode nod2 = new ListNode(4);
		 ListNode nod3 = new ListNode(7);
		 ListNode nod4 = new ListNode(8);
		 ListNode nod5 = new ListNode(13);
		 nod1.next = nod2;nod2.next = nod3;nod3.next=nod4;nod4.next = nod5;
		 ListNode node1 = new ListNode(3);
		 ListNode node2 = new ListNode(5);
		 ListNode node3 = new ListNode(6);
		 ListNode node4 = new ListNode(10);
		 ListNode node5 = new ListNode(12);
		 node1.next=node2; node2.next = node3; node3.next = node4; node4.next = node5;
		 ListNode result = Merge(nod1, node1);
		 while(result!=null) {
			 System.out.print(result.val+"--> ");
			 result = result.next;
		 }
		 
	 }
}
