package tree;

public class Main {
		int max =Integer.MIN_VALUE;
	public int solusion(Node root) {
		getlonestPath(root);
		return max;
	}
		
	public int getlonestPath(Node root) {
		if(root==null) return 0;
		int left = getlonestPath(root.left);
		int right = getlonestPath(root.right);
		max = Math.max(left+right,max);
		System.out.println(max);
		return 1+Math.max(left,right);
		
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
		  System.out.println(new Main().solusion(root));
		 }
}


