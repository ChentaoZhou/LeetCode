package array;

import java.util.Arrays;

public class ReversePair {
	static Long count=new Long(0);
	public static int InversePairs(int[] array) {
		if (array.length == 0)
			return 0;
		int[] copy = new int[array.length];
		divid(array, copy, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
		count = count%1000000007;
		return count.intValue() ;
	}
	public static void divid(int[] array,int[] copy, int low, int high) {
		if(low>=high) return;
		int mid = (low + high) / 2;
		divid(array,copy,low,mid);
		divid(array,copy,mid+1,high);
		merge(array,copy,low,mid,high);
	}

	public static void merge(int[] array, int[] copy, int left, int mid,int right) {
		int leftEnd = mid;
		int rightEnd = right;
		int copyindex = right;
		while (leftEnd >= left && rightEnd > mid) {
			if (array[leftEnd] > array[rightEnd]) {
				count += rightEnd - mid;
				System.out.println("i: "+leftEnd+" j: "+rightEnd+" array: "+array[leftEnd]+" array: "+array[rightEnd]+"count: "+count);
				copy[copyindex--] = array[leftEnd--];
			} else {
				copy[copyindex--] = array[rightEnd--];
			}
		}
		while (leftEnd >= left) {
			copy[copyindex--] = array[leftEnd--];
		}
		while (rightEnd > mid) {
			copy[copyindex--] = array[rightEnd--];
		}
		int k = right;
		for (int m = 0; m < right - left + 1; m++, k--) {
			//System.out.println("high: "+high+" low: "+low+" k: "+k+" i:"+i);
			array[k] = copy[k];
		}
		return ;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,0};
		System.out.println(InversePairs(a));
	}
}
