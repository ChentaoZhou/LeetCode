package tree;

public class FindPathBoolean {
	public static boolean findPath(TreeNode root, int target) {
		if(root==null) return false;
		target-=root.val;
		if(target==0 && root.left==null && root.right==null) {
			return true;
		}
		return findPath(root.left,target) || findPath(root.right,target);
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

		System.out.println(findPath(node1,15));
	}
}
