package array;

import java.util.ArrayList;
import java.util.HashMap;

public class FindNumsAppearOnce {
	public static void FindNumsAppearOnce2(int[] array, int num1[], int num2[]) {
		HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (!list.containsKey(array[i])) {
				list.put(array[i], 1);
			} else {
				list.replace(array[i], list.get(array[i]) + 1);
			}
		}
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (Integer i : list.keySet()) {
			System.out.println("key: " + i + " value: " + list.get(i));
			if (list.get(i) < 2) {
				res.add(i);
				System.out.println("key1: " + i + " value1: " + list.get(i));
			}
		}
		num1[0] = res.remove(res.size() - 1);
		num2[0] = res.remove(res.size() - 1);
	}
	//对每个数异或，得出的结果一定是两个不同的数异或的结果
	//找到第一个位为1的index
	//根据这个index将数据所有数分为两部分
	//将每个部分异或就得到了这两个数
	public static void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		int bitSum = 0;
		for(int i=0;i<array.length;i++) {
			bitSum ^= array[i];
		}
		int index = 1;
		while((bitSum & index) == 0) {
			index = index <<1;
		}
		int result1=0;
		int result2=0;
		for(int i=0;i<array.length;i++) {
			if((array[i] & index) ==0) {
				result1 ^= array[i];
			}else {
				result2^= array[i];
			}
		}
		num1[0] = result1;
		num2[0] = result2;
	}

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] a = { 2, 4, 3, 6, 3, 2, 5, 5 };
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		FindNumsAppearOnce(a, num1, num2);
		System.out.println(num1[0] + " , " + num2[0]);
	}
}
