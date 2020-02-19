package Array;

import java.util.Arrays;

public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array == null) return 0;
        int point = 0;
        for(int i=0;i<array.length-1;i++) {
        	if(array[i]>array[i+1]) {
        		point = i+1;
        		break;
        	}
        }
        return array[point];
//        int[] a = Arrays.copyOfRange(array, 0, point-1);
//        int[] b = Arrays.copyOfRange(array, point, array.length-1);
    }
    
    
	/* binary serach */
//    	public static int minNumberInRotateArray(int[] array) {
//    	        if (array.length == 0)
//    	            return 0;
//    	        int left = 0;
//    	        int right = array.length - 1;
//    	        int middle = -1;
//    	        while (array[left]>=array[right]) {
//    	            if(right-left==1){
//    	                middle = right;
//    	                break;
//    	            }
//    	            middle = left + (right - left) / 2;
//    	            if (array[middle] >= array[left]) {
//    	                left = middle;
//    	            }
//    	            if (array[middle] <= array[right]) {
//    	                right = middle;
//    	            }
//    	        }
//    	        return array[middle];
//    	    }
    
    
}
