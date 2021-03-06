package tree;

public class TreeDepth {
	
	public int TreeDepth(TreeNode root) {
		if(root==null) return 0;
		return 1+Math.max(TreeDepth(root.left), TreeDepth(root.right));
	}
}
 