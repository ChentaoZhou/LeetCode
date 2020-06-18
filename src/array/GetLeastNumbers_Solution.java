package array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GetLeastNumbers_Solution {
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(k>input.length || k==0) return res;
		PriorityQueue<Integer> bigHeap = new PriorityQueue<Integer>(11,new Comparator<Integer>() {
			@Override
			public int compare(Integer i1,Integer i2) {
				return i2-i1;
			}
		});
		
		for(int i=0;i<k;i++) {
			bigHeap.add(input[i]);
		}
		for(int i=k;i<input.length;i++) {
			if(input[i]<bigHeap.peek()) {
				bigHeap.poll();
				bigHeap.add(input[i]);
			}
		}
		while(!bigHeap.isEmpty()) {
			res.add(bigHeap.poll());
		}
		return res;
	}
}
