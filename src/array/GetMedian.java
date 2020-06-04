package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GetMedian {
//	ArrayList<Integer> arr = new ArrayList<Integer>();
//	public void Insert(Integer num) {
//		arr.add(num);
//	}
//
//	public Double GetMedian() {
//		if(arr.size()==1) return arr.get(0)*1.0;
//		Collections.sort(arr);
//		int index = arr.size()/2;
//		if(arr.size()%2 == 1) {
//			Double a = arr.get(index+1)*1.0;
//			return a;
//		}else {
//			Double a = (arr.get(index)+arr.get(index-1))*1.0;
//			return a/2;
//		}
//	}
	int count = 0;
	PriorityQueue<Integer> small = new PriorityQueue<Integer> ();
	PriorityQueue<Integer> big = new PriorityQueue<Integer>(11,new Comparator<Integer>() {
		
		@Override
		public int compare(Integer i1, Integer i2) {
			return i2-i1;
		}
	});
	public void Insert(Integer num) {
		if(count%2==0) {
			small.add(num);
			big.add(small.poll());
		}else {
			big.add(num);
			small.add(big.poll());
		}
		count++;
	}
	public Double GetMedian() {
		if(count==0) return null;
		Double result;
		if(count%2==0) {
			result = (big.peek()+small.peek())/2.0;
		}else {
			result = big.peek()*1.0;
		}
		return result;
	}
	
	
	
}
