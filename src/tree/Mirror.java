package tree;

public class Mirror {
	public void Mirror(TreeNode root) {
		TreeNode left,right;
        if(root!=null) {
        	left = root.left;
        	right = root.right;
        	root.left = right;
        	root.right = left;
        	Mirror(root.left);
        	Mirror(root.right);
        }
    }
}
