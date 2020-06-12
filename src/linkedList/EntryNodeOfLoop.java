package linkedList;

import java.util.HashSet;

public class EntryNodeOfLoop {
	public ListNode EntryNodeOfLoop(ListNode pHead)
	{
		HashSet<ListNode> set = new HashSet<ListNode>();
		if(pHead==null)return null;
		while(pHead!=null) {
			if(set.add(pHead)) {
				pHead = pHead.next;
			}else {
				return pHead;
			}
		}
		return null;
	}
}
