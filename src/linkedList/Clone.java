package linkedList;

public class Clone {
	public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null) return null;
        RandomListNode cur = pHead;
        while(cur!=null) {
        	RandomListNode nextNode = cur.next;
        	RandomListNode bro = new RandomListNode(cur.label);
        	cur.next = bro;
        	bro.next = nextNode;
        	cur = nextNode;
        }
        cur = pHead;
        while(cur!=null) {
        	cur.next.random = cur.random == null? null:cur.random.next;
        	cur = cur.next.next;
        }
        cur = pHead;
        RandomListNode result = pHead.next;
        while(cur!=null) {
        	RandomListNode clone = cur.next;
        	cur.next = clone.next;
        	clone.next = clone.next==null? null:clone.next.next;
        	cur = cur.next;
        }
		return result;
    }
	public static void main(String[] args) {
		RandomListNode a1 = new RandomListNode(2);
		RandomListNode a2 = new RandomListNode(3);
		RandomListNode a3 = new RandomListNode(6);
		RandomListNode a4 = new RandomListNode(8);
		RandomListNode a5 = new RandomListNode(9);
		
	}
}
