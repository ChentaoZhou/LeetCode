import java.util.ArrayList;

public class NumberOf1Between1AndN_Solution {
	int result=0;
	public int NumberOf1Between1AndN_Solution(int n) {
		for(int i=n;i>0;i--) {
			countOne(i);
		}
		return result;
	}
	
	public void countOne(int n) {
		String temp = n+"";
		for(int i=0;i<temp.length();i++) {
			if(temp.charAt(i)=='1') result++;
		}
	}
}
