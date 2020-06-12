package linkedList;

public class LastRemaining_Solution {
	public int LastRemaining_Solution(int n, int m) {
		if(n==0||m==0) return -1;
		ListNode root = new ListNode(-1);
		ListNode pre = root;
		for(int i=0;i<n;i++) {
			ListNode node = new ListNode(i);
			pre.next = node;
			pre = pre.next;
		}
		root = root.next; //0号小朋友
		pre.next = root;
		
		while(n>1) {
			int num = m-1;
			
			for(int i=0;i<num-1;i++) {
				root =root.next;
			}
			root.next = root.next.next;
			root =root.next;
			n--;
		}
		return root.val;
	}
}
