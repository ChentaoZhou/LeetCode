package array;

import java.util.ArrayList;
import java.util.Arrays;
//只能用于正方形矩阵
public class PrintMatrix {
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> result = new ArrayList<Integer>();
	       if(matrix.length==1) {
	    	   result.add(matrix[0][0]);
	       }
	       if(matrix.length>1) {
	    	   ArrayList<ArrayList<Integer>> collection = new ArrayList<ArrayList<Integer>>();
	    	   for(int i=0;i<matrix.length;i++) {
	    		   ArrayList<Integer> temp = new ArrayList<Integer>();
	    		   for(int j = 0;j<matrix.length;j++) {
	    			   temp.add(matrix[i][j]);
	    		   }
	    		 collection.add(temp);	      
	    	   }
	    	   for(ArrayList<Integer> list:collection) {
	    		   System.out.println(list);
	    	   }
	    	   result.addAll(collection.get(0));
	    	   System.out.println(result);
	    	   for(int i=1;i<collection.size();i++) {
	    		   result.add((Integer) collection.get(i).remove(matrix.length-1));
	    	   }
	    	   System.out.println(result);
	    	   for(int i=matrix.length-2;i>=0;i--) {
	    		   result.add((Integer) collection.get(collection.size()-1).remove(i));
	    	   }
	    	   System.out.println(result);
	    	   for(int i= matrix.length-2;i>=1;i--) {
	    		   result.add((Integer) collection.get(i).remove(0));
	    	   }
	    	   System.out.println(result);
	    	   collection.remove(0);
	    	   if(matrix.length>2) {
	    		   System.out.println(matrix.length);
	    		   int[][] rest = new int [matrix.length-2][matrix.length-2];
	    		   for(int i=0;i<collection.size();i++) {
	    			   for(int j=0;j<collection.get(i).size();j++) {
	    				   rest[i][j]= (int) collection.get(i).get(j);
	    			   }
	    		   }
	    		   result.addAll(printMatrix(rest));
	    	   }	   
	       }
		return result;
    }
	 public static void main(String[] args) {
		 int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		 System.out.println(printMatrix(a));
	 }
}
 