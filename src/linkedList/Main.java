package linkedList;

public class Main {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null || pHead2==null) return null;
        int len1 = 0,len2=0;
        ListNode cur1,cur2;
        cur1 = pHead1; cur2 = pHead2;
       while(cur1!=null){
           len1++;
           cur1 = cur1.next;
       } 
       while(cur2!=null){
           len2++;
           cur2 = cur2.next;
       }
       if(len1>len2){
           int extra = len1-len2;
           while(extra>0){
               pHead1 = pHead1.next;
               extra--;
           }
       }
       if(len1<len2){
           int extra = len2-len1;
           System.out.println(extra);
           System.out.println("pHead2: "+pHead2.val);
          while(extra>0){
               pHead2 = pHead2.next;
               extra--;
           }
          System.out.println("pHead2: "+pHead2.val);
       }
      
       while(pHead1!=null && pHead2!=null){
           if(pHead1 == pHead2) return pHead1;
           else{
               pHead1 = pHead1.next;
               pHead2 = pHead2.next;
           }
       }
       return null;
   }
    public static void main(String[] args) {
    	ListNode node1 = new ListNode(4);
    	ListNode node2 = new ListNode(1);
    	ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(4);
    	ListNode node5 = new ListNode(5);
    	
    	ListNode node6 = new ListNode(5);
    	ListNode node7 = new ListNode(6);
    	ListNode node8 = new ListNode(1);
    	
    	node1.next = node2; node2.next = node3; node3.next = node4; node4.next = node5;
    	node6.next = node7; node7.next = node8; node8.next = node3;
    	
    	System.out.println(new Main().FindFirstCommonNode(node1, node6).val);
    	
    	
    	
    	
    					
    }
}
