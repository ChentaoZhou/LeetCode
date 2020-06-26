package tree;
// Find the Max length of two nodes(left nodes)
public class FindMaxLength {
	static int max=-1;
	public static int findMaxLength(Node root) {
		findMax(root);
		return max;
	}
	public static int findMax(Node a) {
		if(a == null) return -1;
		int leftDepth = findMax(a.left)+1;
		int rightDepth = findMax(a.right)+1;
		int distence = leftDepth + rightDepth;
		if(distence>max) max = distence;
		return Math.max(rightDepth, leftDepth);
	}
	 public static void main(String[] args) {
		  Node root = new Node();
		  Node n1 = new Node();
		  Node n2 = new Node();
		  Node n3 = new Node();
		  Node n4 = new Node();
		  Node n5 = new Node();
		  Node n6 = new Node();
		  Node n7 = new Node();
		  Node n8 = new Node();
		  Node n9 = new Node();
		  root.left = n1;
		  n1.left = n2;
		  n2.left = n3;
		  n3.left = n4;
		  n2.right = n5;
		  n1.right = n6;
		  n6.right = n7;
		  n7.right = n8;
		  root.right = n9;
		  System.out.println(findMaxLength(root));
		 }
}
class Node {
	 public Node left;
	 public Node right;
	}