package tree;

import java.util.Stack;

public class KthNode {
	int mark = 0;
	
	TreeNode KthNode(TreeNode pRoot, int k) {
		if(k<=0 || pRoot==null) {
			return null;
		}
		TreeNode result = null;
		if(pRoot.left!=null) 
			result = KthNode(pRoot.left,k);
			
		
			mark++;
			if(result==null) {
				if(mark == k) {
					result = pRoot;
					return result;
				}
			}
			
			if(result==null && pRoot.right!=null) {
				result = KthNode(pRoot.right,k);
			}
			return result;
	}
	int count =0;
	TreeNode kthNode(TreeNode pRoot, int k) {
		if(pRoot==null || k<=0) return null;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		do {
			if(pRoot!=null) {
				stack.push(pRoot);
				pRoot = pRoot.left;
			}else {
				pRoot = stack.pop();
				count++;
				if(count == k) {
					return pRoot;
				}
				pRoot = pRoot.right;
			}
		}while(pRoot!=null || !stack.isEmpty());
		return null;
		
	}
	
	
	
	
}
