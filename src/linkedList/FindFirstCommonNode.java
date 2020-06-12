package linkedList;

import java.util.HashSet;

public class FindFirstCommonNode {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if(pHead1 == null || pHead2==null) return null;
		HashSet<ListNode> set = new HashSet<ListNode>();
		while(pHead1!=null) {
			set.add(pHead1);
			pHead1= pHead1.next;
		}
		while(pHead2!=null) {
			if(set.add(pHead2)) {
				pHead2 = pHead2.next;
			}else {
				return pHead2;
			}
		}
		return null;
	}
}
