package array;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintMinNumber {
	//找到数组中最高位最小的数作为第一个数
	//如果最高位相同比后面的位数，如果某一个数没有后续的位数，就看当前数的该位和最高位，比最高位小就用这个数。
	public String PrintMinNumber(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<numbers.length;i++) {
			list.add(numbers[i]);
		}
	}
}
