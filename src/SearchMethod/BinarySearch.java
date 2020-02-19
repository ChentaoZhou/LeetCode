package SearchMethod;

public class BinarySearch {
	public static boolean binarySearch(int target, int[] array) {
		int l = 0; int r = array.length-1;
		while(l<=r) {
			int m = (l+r)/2;
			if(target == array[m]) return true;
			else if(target < array[m]) r = m-1;
			else l = m+1;
		}
		return false;
	}
}
