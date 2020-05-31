package array;

import java.util.ArrayList;
import java.util.Arrays;

public class ReOrderArray {
    public static void reOrderArray(int [] array) {
       ArrayList<Integer> odds = new ArrayList<Integer>();
       ArrayList<Integer> evens = new ArrayList<Integer>();
        for(int i=0;i<array.length;i++) {
        	if(array[i]%2 != 0) {
        		odds.add(array[i]);
        	}
        	else {
        		evens.add(array[i]);
        	}
        }
       
        	odds.addAll(evens);
        	
        	for(int i=0;i<odds.size();i++) {
        		array[i] = odds.get(i);
        	}
        
//        System.arraycopy(odds, 0, array, 0, oddIndex+1);
//        System.arraycopy(evens, 0, array, oddIndex+1, evenIndex+1);
    }
    public static void main(String[] args) {
    	int[] a =  { 2,4,6,1,3,5,7 };
    	reOrderArray(a);
    	System.out.println(Arrays.toString(a));
    }
}
