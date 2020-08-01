package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LC958_CheckCompletenessofaBinaryTree {
	//method changes the value of TreeNode
	public boolean isCompleteTree(TreeNode root) {
		if(root==null) return false;
		Queue<TreeNode> queue = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		queue.offer(root);
		root.val=1;
		while(!queue.isEmpty()) {
			TreeNode tem = queue.poll();
			list.add(tem.val);
			if(tem.left!=null) {
				tem.left.val = 2*tem.val;
				queue.offer(tem.left);
			}
			if(tem.right!=null) {
				tem.right.val = 2*tem.val+1;
				queue.offer(tem.right);
			}
		}
		return list.get(list.size()-1) == list.size();
	}
}
