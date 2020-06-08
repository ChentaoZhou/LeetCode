package tree;

public class isSymmetrical {
	boolean isSymmetrical(TreeNode pRoot) {
		return isSame(pRoot,pRoot);
		
	}
	public boolean isSame(TreeNode r1, TreeNode r2) {
		if(r1==null&&r2==null) return true;
		if(r1==null || r2==null) return false;
		return r1.val==r2.val &&isSame(r1.left,r2.right) &&isSame(r1.right,r2.left);
		
	}
}
