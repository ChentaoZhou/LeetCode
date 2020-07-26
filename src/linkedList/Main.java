package linkedList;

public class Main {
    public static int LastRemaining_Solution(int n, int m) {
        ListNode root = new ListNode(0);
        ListNode node = root;
        for(int i=1;i<n;i++){
            ListNode temp = new ListNode(i);
            System.out.println(temp.val);
            node.next = temp;
            node = node.next;
        }
        node.next = root;
        node = root;
        while(n>1){
            for(int i=1;i<m-1;i++){
                node = node.next;
            }
            node.next = node.next.next;
            node = node.next;
            n--;
        }
        return node.val;
    }
    public static void main(String[] args) {
    	LastRemaining_Solution(5,3);
    }
}
