package tree;

public class HasSubtree2 {
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if(root1!=null && root2!=null) {
			if(root1.val == root2.val) {
				result = doesTree1HaveTree2(root1,root2);
			}
			if(!result) {
				result = HasSubtree(root1.left,root2);
			}
			if(!result) {
				result = HasSubtree(root1.right,root2);
			}
		}
		return result;
	}
	
	public boolean doesTree1HaveTree2(TreeNode node1, TreeNode node2) {
		//if node2 is done, that means tree1 contains tree2
		if(node2 == null) {
			return true;
		}
		//if node1 is done, that means tree1 is over while tree2 still have nodes remains, false.
		if(node1 == null) {
			return false;
		}
		if(node1.val!=node2.val) {
			return false;
		}
		//if these two nodes have same values, compare their left and right trees.
		return doesTree1HaveTree2(node1.left,node2.left) &&doesTree1HaveTree2(node1.right,node2.right);
	}
}
