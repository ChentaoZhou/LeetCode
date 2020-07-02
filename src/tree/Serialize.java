package tree;

public class Serialize {
//	int i=-1;
//	String Serialize(TreeNode root) {
//		String result = "";
//		if(root==null) return "#"+"!";
//		result = result+ root.val+"!";
//		result = result+ Serialize(root.left);
//		result = result+ Serialize(root.right);
//		return result;
//
//	}
//
//	TreeNode Deserialize(String str) {
//		String[] strs = str.split("!");
//		i++;
//		if(strs[i].equals("#")) return null;
//		TreeNode temp = new TreeNode(Integer.parseInt(strs[i]));
//		temp.left = Deserialize(str);
//		temp.right = Deserialize(str);
//		return temp;
//	}
    static int i=-1;
  static String Serialize(TreeNode root) {
      String res = "";
      if(root==null) return "#"+"!";
      res= res + root.val+"!";
      res= res + Serialize(root.left);
      res= res + Serialize(root.right);
      return res;
}
  static TreeNode Deserialize(String str) {
      String[] chars = str.split("!");
      i++;
      if(chars[i].equals("#")) return null;
      TreeNode root = new TreeNode(Integer.parseInt(chars[i]));
      root.left = Deserialize(str);
      root.right = Deserialize(str);
      return root;
}
	

	
	public static void main(String[] args) {
		TreeNode a1 = new TreeNode(5);
		TreeNode a2 = new TreeNode(3);
		TreeNode a3 = new TreeNode(8);
		TreeNode a4 = new TreeNode(1);
		TreeNode a5 = new TreeNode(4);
		TreeNode a6 = new TreeNode(7);
		TreeNode a7 = new TreeNode(9);
		a1.left = a2; a1.right = a3;
		a2.left = a4; a2.right = a5;
		a3.left = a6; a3.right = a7;
		
		System.out.println(Serialize(a1));
		String a = Serialize(a1);
		//Deserialize(a);
	}
}
