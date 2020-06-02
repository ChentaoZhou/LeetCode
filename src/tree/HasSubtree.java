package tree;

public class HasSubtree {
	public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 != null && root2 != null) {
        TreeNode temp = searchNode(root1,root2);
        if(temp == null) {
        	return false;
        }else {
        	System.out.println(temp.val);
        	
        	if(temp.left!=null || root2.left!=null) {
        		HasSubtree(temp.left,root2.left);
        	}
        	if(temp.right!=null || root2.right!=null) {
        		HasSubtree(temp.right,root2.right);
        	}
        }
        return true;
        }
        return false;
    }

	public static TreeNode searchNode(TreeNode root, TreeNode target) {
		if(target==null || root == null) return null;
		while(root!=null) {
			if(target.val == root.val) return root;
			else if(target.val<root.val) {
				root = root.left;
			}else {
				root = root.right;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(6);
		TreeNode node2 = new TreeNode(4);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(8);
		TreeNode node6 = new TreeNode(7);
		TreeNode node7 = new TreeNode(10);
		
		TreeNode node8 = new TreeNode(9);
		
		node1.left = node2; node1.right = node5;
		node2.left = node3; node2.right = node4;
		node5.left = node6; node5.right = node7;
		
		TreeNode result = searchNode(node1, node7);
		System.out.println(HasSubtree(node1, node8));

	}
}
