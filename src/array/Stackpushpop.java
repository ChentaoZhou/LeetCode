package array;

import java.util.Stack;

public class Stackpushpop {
	   public static boolean IsPopOrder(int [] pushA,int [] popA) {
		      int i=0,j=0;
		        Stack<Integer> stack =  new Stack<Integer>();
		        int lena = pushA.length;int lenb = popA.length;
		        while(i<lena && j<lenb){
		            if(pushA[i] != popA[j]){
		                stack.push(pushA[i++]);
		            }
		            if(i<lena && j<lenb && pushA[i] == popA[j]){
		                i++;
		                j++;
		            }
		        }
		        while(j<lenb){
		            if(stack.pop()!=popA[j]) return false;
		            else j++;
		        }
		        if(stack.isEmpty()) return true;
		        
		        return false;
		        
		    }
	   
	   public static void main(String[] args) {
		   int[] a= {1,2,3,4,5};
		   int[] b = {4,3,5,1,2};
		  System.out.println(IsPopOrder(a,b)); 
	   }
}
