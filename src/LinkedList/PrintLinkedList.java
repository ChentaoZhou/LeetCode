package LinkedList;

import java.util.ArrayList;

public class PrintLinkedList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(listNode != null) {
        a.add(0, listNode.val);
        listNode = listNode.next;
        }
		return a;
    }
}
