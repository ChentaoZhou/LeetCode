package array;

import java.util.ArrayList;
import java.util.HashMap;

public class FindNumbersWithSum {
	public static ArrayList<Integer> FindNumbersWithSum2(int[] array, int sum) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		if(array.length<2) return temp;
		int left = 0, right = array.length-1;
		while(left<right) {
			if(array[left]+array[right] == sum) {
				temp = new ArrayList<Integer>();
				temp.add(array[left]);
				temp.add(array[right]);
				list.add(temp);
				right--;
			}else if(array[left]+array[right] < sum){
				left++;
			}else {
				right--;
			}
		}
		if(list.isEmpty()) return temp;
		if(list.size()==1) {
			return list.get(0);
		}
		System.out.println(list);
		int min = sum*sum; int index = 0;
		for(ArrayList<Integer> a:list) {
			if(a.get(0)*a.get(1)<min) {
				min = a.get(0)*a.get(1);
				index = list.indexOf(a);
			}
		}
		return list.get(index);	
	}
	public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		if(array.length<2) return temp;
		int left = 0, right = array.length-1;
		while(left<right) {
			if(array[left]+array[right] == sum) {
				temp = new ArrayList<Integer>();
				temp.add(array[left]);
				temp.add(array[right]);
				return temp;
			}else if(array[left]+array[right] < sum){
				left++;
			}else {
				right--;
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println(FindNumbersWithSum(a, 21));
	}
}
