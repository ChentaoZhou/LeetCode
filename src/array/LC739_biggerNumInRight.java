package array;

import java.util.Arrays;
import java.util.Stack;

public class LC739_biggerNumInRight {
	public int[] findBigger(int[] a) {
		int[] res =new int[a.length];
		if(a.length==0) return res;
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for(int i=1;i<a.length;i++) {
			if(stack.isEmpty() || a[stack.peek()]>=a[i]) {
				stack.push(i);
			}else {
				while(!stack.isEmpty() && a[stack.peek()]<a[i]) {
					res[stack.pop()] = a[i];
				}
				stack.push(i);
			}
		}
		while(!stack.isEmpty()) {
			res[stack.pop()] = -1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] a = {8, 2, 5, 4, 3, 9, 7, 2, 5};
		int[] res = new LC739_biggerNumInRight().findBigger(a);
		System.out.println(Arrays.toString(res));
	}
}
