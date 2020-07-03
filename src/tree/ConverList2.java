package tree;

public class ConverList2 {
	   TreeNode pre = null;
	    public TreeNode Convert(TreeNode root) {
	        if(root==null) return null;
	        Convert(root.right);
	        if(pre!=null){
	            pre.left = root;
	            root.right = pre;
	        }
	        pre = root;
	        Convert(root.left);
	        return pre;
	    }
	
	
	
	
	
//	protected TreeNode leftLast = null;
//
//	public TreeNode Convert(TreeNode root) {
//		if (root == null)
//			return null;
//		if (root.left == null && root.right == null) {
//			leftLast = root;// 鏈�鍚庣殑涓�涓妭鐐瑰彲鑳戒负鏈�鍙充晶鐨勫彾鑺傜偣
//			return root;
//		}
//		// 1.灏嗗乏瀛愭爲鏋勯�犳垚鍙岄摼琛紝骞惰繑鍥為摼琛ㄥご鑺傜偣
//		TreeNode left = Convert(root.left);
//		// 3.濡傛灉宸﹀瓙鏍戦摼琛ㄤ笉涓虹┖鐨勮瘽锛屽皢褰撳墠root杩藉姞鍒板乏瀛愭爲閾捐〃
//		if (left != null) {
//			leftLast.right = root;
//			root.left = leftLast;
//		}
//		leftLast = root;// 褰撴牴鑺傜偣鍙惈宸﹀瓙鏍戞椂锛屽垯璇ユ牴鑺傜偣涓烘渶鍚庝竴涓妭鐐�
//		// 4.灏嗗彸瀛愭爲鏋勯�犳垚鍙岄摼琛紝骞惰繑鍥為摼琛ㄥご鑺傜偣
//		TreeNode right = Convert(root.right);
//		// 5.濡傛灉鍙冲瓙鏍戦摼琛ㄤ笉涓虹┖鐨勮瘽锛屽皢璇ラ摼琛ㄨ拷鍔犲埌root鑺傜偣涔嬪悗
//		if (right != null) {
//			right.left = root;
//			root.right = right;
//		}
//		return left != null ? left : root;
//	}
}
