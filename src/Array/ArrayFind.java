package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import SearchMethod.BinarySearch;

public class ArrayFind {
	public static boolean Find(int target, int [][] array) {
    	int n = array.length;   //二维数组列数
    	int h = array[0].length; //每行的个数
    	for(int i=n-1,j=0;i>=0 && j<h;) {
//    			System.out.println("i: "+i+" j: "+j);
    			if(target == array[i][j]) return true;
    			else if(target > array[i][j]) j++;
    			else i--;
    	}
		return false;
    }
	
	

//    public static boolean Find(int target, int [][] array) {
//    	int n = array.length;   //二维数组列数
//    	int h = array[0].length; //每行的个数
//    	for(int i=0;i<n;i++) {
//    		for(int j=0;j<h;j++) {
//    			if(target == array[i][j]) return true;
//    			else if(target > array[i][j]) continue;
//    			else n=j;
//    		}
//    	}
//		return false;
//    }
    public static void main(String[] args) {
    	int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
    	System.out.println(Find(1,array));
    	ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    	Collections.reverse(a);
    	System.out.println(a);
    }
}
