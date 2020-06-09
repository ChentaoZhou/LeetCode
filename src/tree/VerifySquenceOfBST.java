package tree;

public class VerifySquenceOfBST {
	public boolean VerifySquenceOfBST(int[] sequence) {
		if(sequence.length==0) return false;
		if(sequence.length==1) return true;
		return judge(sequence, 0, sequence.length-1);
	}
	public boolean judge(int[] a, int start, int root) {
		if(start>=root) return true;
		int i = root;
		while(i>start && a[i-1]>a[root]) i--; //从数组的后面找到比根节点小的数 的后一位
		//通过上一个while将数组分为了两部分，前一部分所有数都要比root小，否则false
		for(int j=0;j<i-1;j++) {
			if(a[j]>a[root]) return false;
		}
		return judge(a, start, i-1) && judge(a, i, root-1);
	}
}
