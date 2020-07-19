import java.util.ArrayList;
import java.util.Arrays;

import linkedList.ListNode;

public class Main {
	private static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	 public static ListNode Merge(ListNode list1,ListNode list2) {
	        if(list1==null) return list2;
	        if(list2==null) return list1;
	        ListNode vhead = null,cur = null;
	        while(list1!=null && list2!=null){
	            if(list1.val<=list2.val){
	            	
	            	if(vhead==null) {
	            		vhead=list1;
	            		cur= list1;
	            	}else {
		                cur.next = list1;
		                cur = cur.next;
	            	}
	            	list1 = list1.next;
	            }
	            else if(list1.val>list2.val) {
	            	
	            	if(vhead==null) {
	            		vhead=list2;
	            		cur = list2;
	            	}
	            
	            else{
	                cur.next = list2;
	                cur=cur.next;
	                
	            }
	            	list2 = list2.next;
	            }
	        }
	        if(list1!=null) cur.next = list1;
	        if(list2!=null) cur.next = list2;
	        System.out.println(vhead.val);
	        return vhead;
	        
	    }
	 public static void main(String[] args) {
		 ListNode nod1 = new ListNode(1);
		 ListNode nod2 = new ListNode(3);
		 ListNode nod3 = new ListNode(5);
		 ListNode nod4 = new ListNode(8);
		 ListNode nod5 = new ListNode(13);
		 nod1.next = nod2;nod2.next = nod3;//nod3.next=nod4;nod4.next = nod5;
		 ListNode node1 = new ListNode(2);
		 ListNode node2 = new ListNode(4);
		 ListNode node3 = new ListNode(6);
		 ListNode node4 = new ListNode(10);
		 ListNode node5 = new ListNode(12);
		 node1.next=node2; node2.next = node3; //node3.next = node4; node4.next = node5;
		 ListNode result = Merge(nod1, node1);
		 while(result!=null) {
			 System.out.print(result.val+"--> ");
			 result = result.next;
		 }
		 
	 }
	
}

