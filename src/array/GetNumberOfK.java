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
	//下界定义为：如果存在目标值，则指向第一个目标值，否则，如果不存在， 则指向大于目标值的第一个值。
	//上界定义为：不管目标值存在与否，都指向大于目标值的第一个值。
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
