package array;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintMinNumber {
	//找到数组中最高位最小的数作为第一个数
	//如果最高位相同比后面的位数，如果某一个数没有后续的位数，就看当前数的该位和最高位，比最高位小就用这个数。
	  public String PrintMinNumber(int [] numbers) {
	        if(numbers.length==0 || numbers==null) return "";
	        for(int i=0;i<numbers.length;i++){
	            for(int j=i+1;j<numbers.length;j++){
	                int sum1 = Integer.valueOf(numbers[i]+""+numbers[j]);
	                int sum2 = Integer.valueOf(numbers[j]+""+numbers[i]);
	                if(sum1>sum2){
	                    int temp = numbers[j];
	                    numbers[j] = numbers[i];
	                    numbers[i] = temp;
	                }
	            }
	        }
	        StringBuilder res = new StringBuilder();
	        for(int i=0;i<numbers.length;i++){
	            res.append(numbers[i]);
	        }
	        return res.toString();
	    }
}
