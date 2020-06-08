package tree;

public class IsBalanced_Solution {
	public boolean IsBalanced_Solution(TreeNode root) {
		if(root==null) return true;
		if(root.left!=null) {
			if(!IsBalanced_Solution(root.left)) return false;
		}
		if(root.right!=null) {
			if(!IsBalanced_Solution(root.right)) return false;
		}
		int leftDepth = getDepth(root.left);
		int rightDepth = getDepth(root.right);
		if(Math.abs(leftDepth-rightDepth)>1) {
			return false;
		}else {
			return true;
		}
		
	}
	public int getDepth(TreeNode root) {
		if(root==null) return 0;
		return 1+Math.max(getDepth(root.left), getDepth(root.right));
	}
}
