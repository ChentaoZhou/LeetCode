package array;

public class SearchInRotatedArray {
	public static int search(int[] nums, int target) {
		int left = 0, right = nums.length-1;
		int mid = (left+right)/2;
		while(left<=right) {
			if(right-left<=1) {
				if(nums[left]== target) return left;
				if(nums[right]==target) return right;
				else return -1;
			}
			if(nums[mid]==target) return mid;
			System.out.println(mid);
			if(nums[mid]>nums[left]) {
				if(nums[left]<=target && target<=nums[mid]) {
					right = mid-1;
					mid = (left+right)/2;
				}else {
					left = mid+1;
					mid = (left+right)/2;
				}
			}
			else {
				if(nums[mid]<=target && target<=nums[right]) {
					left = mid+1;
					mid = (left+right)/2;
				}else {
					right = mid-1;
					mid = (left+right)/2;
				}
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] a = {1,3,5};
		System.out.println(search(a,5));
	}
	
	
	
	
	
}
