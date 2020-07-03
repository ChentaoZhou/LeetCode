package tree;

import java.util.ArrayList;
import java.util.Stack;

public class PrintZ {
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(pRoot==null) return res;
		Stack<TreeNode> old = new Stack<TreeNode>();
		Stack<TreeNode> curr = null;
		old.push(pRoot);
		int layer = 1;
		
		while(!old.isEmpty() || !curr.isEmpty() ) {
			
			while(res.size()<layer) {
				res.add(new ArrayList<Integer>());
			}
			
			curr = new Stack<TreeNode>();
			while(!old.isEmpty()) {
				TreeNode temp = old.pop();
				res.get(layer-1).add(temp.val);
				//如果奇数层，从左往右。层数从1开始算。
				if(temp.left!=null && layer%2 != 0)  curr.add(temp.left);
				if(temp.right!=null && layer%2 != 0) curr.add(temp.right);
				//如果偶数层，从右往左。
				if(temp.right!=null && layer%2 == 0) curr.add(temp.right);
				if(temp.left != null && layer%2 == 0) curr.add(temp.left);
			}
			layer++;
			old = curr;
		}
		return res;
		
	}

}
