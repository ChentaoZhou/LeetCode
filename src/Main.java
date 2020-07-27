import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import linkedList.ListNode;
import tree.TreeNode;

public class Main {
	  public int maxProfit(int[] prices) {
	        int profit=0;
	        for(int i=1;i<prices.length;i++){	 
	            if(prices[i]>prices[i-1]){
	            	System.out.println("prices[i]: "+ prices[i]+ " prices[i-1]: "+prices[i-1]);
	                profit+=(prices[i]-prices[i-1]);
	            }
	        }
	        return profit;
	    }
	public static void main(String[] args) {
		int[] a = {7,1,5,3,6,4};
		new Main().maxProfit(a);
	}
	
	
	
	 
//	public static void main(String[] args) {
//		int[] a = {1,3,5,5,5,5,5,5,5,6,9};
//		int k = 5;
//		int left = 0,right = a.length-1;
//	       int index =-1;
//	        while(left<=right){
//	            int mid = (left+right)/2;
//	            if(a[mid] == k) {
//	            	index = mid;
//	            	break;
//	            }
//	            else if(a[mid]>k) right = mid-1;
//	            else left = mid+1;
//	        }
//		System.out.println(index);
//		
//		
//	 }

}

