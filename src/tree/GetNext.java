package tree;

import java.util.ArrayList;

public class GetNext {
//	static ArrayList<TreeLinkNode> inorderList = new ArrayList<TreeLinkNode>();
//	static TreeLinkNode temp;
//	public static TreeLinkNode GetNext(TreeLinkNode pNode) {
//		temp = pNode;
//		while(pNode.next!=null) pNode = pNode.next;
//		System.out.println(pNode.val+"---");
//		inOrder(pNode);
//		int index = inorderList.indexOf(temp);
//		if(index >= inorderList.size()-1) return null;
//		return inorderList.get(index);
//	}
//	
//	public static void inOrder(TreeLinkNode pNode){	
//		if(pNode.left!=null) {
//			inOrder(pNode.left);
//		}
//		inorderList.add(pNode);
//		if(pNode.right!=null) {
//			inOrder(pNode.right);
//		}
//		return ;
//	}

	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if(pNode == null) return null;
		if(pNode.right!=null) {
			return getLeftMost(pNode.right);
		}
		else {
			return findParent(pNode);
		}
	}
	public TreeLinkNode findParent(TreeLinkNode pNode) {
		if(pNode.next== null) return null;
		if(pNode.next.left == pNode) return pNode.next;
		else {
			return findParent(pNode.next);
		}
		
	}
	TreeLinkNode result = null;
	public TreeLinkNode getLeftMost(TreeLinkNode pNode) {
		if(pNode.left!=null) getLeftMost(pNode.left);
		else {
			result = pNode;
		}
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		TreeLinkNode a1 = new TreeLinkNode(8);
		TreeLinkNode a2 = new TreeLinkNode(6);
		TreeLinkNode a3 = new TreeLinkNode(10);
		TreeLinkNode a4 = new TreeLinkNode(5);
		TreeLinkNode a5 = new TreeLinkNode(7);
		TreeLinkNode a6 = new TreeLinkNode(9);
		TreeLinkNode a7 = new TreeLinkNode(11);

		a2.next = a1;
		a2.left = a4;
		a2.right = a5;
		a3.next = a1;
		a3.left = a6;
		a3.right = a7;
		a1.left = a2;
		a1.right = a3;

		
	}

}
