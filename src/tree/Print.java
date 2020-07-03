package tree;

import java.util.ArrayList;
import java.util.Collections;

public class Print {
	static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	
	static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		if(pRoot == null) return result;
		int layer = 0;
		printNode(pRoot,layer);
		//int a = Collections.binarySearch(result.get(1),111 );
		return result;

	}
	public static void printNode(TreeNode pRoot, int layer) {
		while(result.size()<=layer) {
			result.add(new ArrayList<Integer>());
		}
		result.get(layer).add(pRoot.val);
		layer++;
		if(pRoot.left!=null) {
			printNode(pRoot.left, layer);
		}
		if(pRoot.right!=null) {
			printNode(pRoot.right,layer);
		}
	}
	public static void main(String[] args) {
		TreeNode a1 = new TreeNode(5);
		TreeNode a2 = new TreeNode(3);
		TreeNode a3 = new TreeNode(8);
		TreeNode a4 = new TreeNode(1);
		TreeNode a5 = new TreeNode(4);
		TreeNode a6 = new TreeNode(7);
		TreeNode a7 = new TreeNode(9);
		a1.left = a2; a1.right = a3;
		a2.left = a4; a2.right = a5;
		a3.left = a6; a3.right = a7;
		
		ArrayList<ArrayList<Integer>> test =Print(a1);
		System.out.println(test.get(1));
	}
}
