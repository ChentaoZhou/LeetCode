package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC199_BinaryTreeRightView {
	 public List<Integer> rightSideView(TreeNode root) {
	    List<Integer> res = new ArrayList<>();
	    if(root==null) return res;
	    Queue<TreeNode> old = new LinkedList<>();
	    Queue<TreeNode> cur = null;
	    old.offer(root);
	    while(!old.isEmpty() || !cur.isEmpty()) {
	    	cur = new LinkedList<>();
	    	while(!old.isEmpty()) {
	    		if(old.size()==1) {
	    			res.add(old.peek().val);
	    		}
	    		TreeNode temp = old.poll();
	    		if(temp.left!=null) cur.add(temp.left);
	    		if(temp.right!=null) cur.add(temp.right);
	    	}
	    	old = cur;
	    }
	    return res;
	 }
}
