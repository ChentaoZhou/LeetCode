package array;

public class GetNumberOfK {
	// 基本遍历
	public int GetNumberOfK3(int[] array, int k) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == k) {
				count++;
			}
		}
		return count;
	}
	//二分查找到目标数字的上下界，下界为自己，上界比自己大
	//如果没有这个数，下界为后一个数
	public int GetNumberOfK(int[] array, int k) {
		int lbound, rbound;
		int l=0, r=array.length;
		
		while(l<r) {
			int mid = (l+r-1)/2;
			if(array[mid]<k) {
				l = mid+1;
			}else {
				r=mid;
			}
		}
		lbound = l;
		l=0; r=array.length;
		while(l<r) {
			int mid = (l+r-1)/2;
			if(array[mid] <= k) {
				l=mid+1;
			}else {
				r = mid;
			}
		}
		rbound = r;
		
		return rbound-lbound;	
	}
}
