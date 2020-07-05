package array;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class MaxInWindows {
	public ArrayList<Integer> maxInWindows(int[] num, int size) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		if (size <= 0)
			return result;
		for (int i = 0; i <= num.length - size; i++) {
			int temp = num[i];
			for (int j = 1; j < size; j++) {
				temp = Math.max(temp, num[i + j]);
			}
			result.add(temp);
		}
		return result;
	}

	public static ArrayList<Integer> maxInWindows2(int[] num, int size) {
		ArrayList<Integer> res = new ArrayList<>();
		if (size == 0)
			return res;
		int begin;
		ArrayDeque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < num.length; i++) {
			begin = i - size + 1;
			if (q.isEmpty())
				q.add(i);
			else if (begin > q.peekFirst())//如果begin大于队列第一个数，代表第一个数已近过期
				q.pollFirst();

			while ((!q.isEmpty()) && num[q.peekLast()] <= num[i])
				System.out.println(q.pollLast());
			q.add(i);
			if (begin >= 0)
				res.add(num[q.peekFirst()]);
		}
		return res;
	}
	 public static ArrayList<Integer> maxInWindows3(int[] num, int size) {
	      
			ArrayList<Integer> result = new ArrayList<Integer>();
	        	if(size <=0) return result;
			    int s=0; int e=size-1;
	        while(e<num.length){
	            int max=-1;
	            for(int i=s;i<=e;i++){
	                max = Math.max(max,num[i]);
	                
	            }
	            result.add(max);
	            
	            System.out.println("s: "+s+" e: "+e+"  result: "+max);
	            s++;e++;
	        }
	        return result;
		}
	
	public static void main(String[] args) {
		int[] a = {2,3,4,2,6,2,5,1};
		System.out.println(maxInWindows3(a,3));
		
		
		
	}
}
