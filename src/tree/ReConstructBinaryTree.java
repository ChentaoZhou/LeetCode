package tree;

import java.util.Arrays;

public class ReConstructBinaryTree {
	 
	  private class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	  public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		  if(pre.length == 0) {
			  return null;
		  }
		  int rootval = pre[0];
		  TreeNode root = new TreeNode(rootval);
		  if(pre.length == 1) {
			  return root;
		  }
		  int rootIndex = 0;
		  for(int i=0;i<in.length;i++) {
			  if(rootval == in[i]) {
				  rootIndex = i;
				  break;
			  }
		  }
		  root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, rootIndex+1),Arrays.copyOfRange(in, 0, rootIndex));
		  root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, rootIndex+1, pre.length),Arrays.copyOfRange(in, rootIndex+1, in.length));
		  
		  return root;
	  }
	 
}
