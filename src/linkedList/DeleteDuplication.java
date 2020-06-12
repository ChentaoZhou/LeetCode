package linkedList;

public class DeleteDuplication {
	/* 删除重复节点，保留一个。不全删
	public ListNode deleteDuplication(ListNode pHead) {
		if(pHead==null) return null;
		ListNode cur = pHead;
		ListNode nextNode = pHead.next;
		while(cur!=null &&nextNode!=null) {
			if(cur.val == nextNode.val) {
				cur.next = nextNode.next;
				nextNode = nextNode.next;
			}else {
				cur = cur.next;
				nextNode = nextNode.next;
			}
		}
		return pHead;
	}
	*/
	//创建一个新的dommy node在最前。
	public ListNode deleteDuplication(ListNode pHead) {
		ListNode vhead = new ListNode(-1);
		vhead.next = pHead;
		ListNode pre = vhead;
		ListNode cur = pHead;
		
		while(cur!=null) {
			if(cur.next!=null && cur.val == cur.next.val) {
				cur = cur.next;
				while(cur.next!=null && cur.val == cur.next.val) {
					cur = cur.next;
				}
				cur = cur.next;
				pre.next = cur;
			}else {
				pre = cur;
				cur =cur.next;
			}
		}
		return vhead.next;
	}
}
