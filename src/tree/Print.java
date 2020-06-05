package tree;

import java.util.ArrayList;

public class Print {
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	
	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		if(pRoot == null) return result;
		int layer = 0;
		printNode(pRoot,layer);
		return result;

	}
	public void printNode(TreeNode pRoot, int layer) {
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
}
