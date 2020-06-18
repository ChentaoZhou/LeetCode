import java.util.ArrayList;

public class NumberOf1Between1AndN_Solution {
	int result=0;
	public int NumberOf1Between1AndN_Solution2(int n) {
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
	//分别计算个位，十位，百位以此类推，1出现的个数
	//个位：n / 10 * 1 + (if(k > 1) 1 else if(k < 1) 0 else k - 1 + 1)		k = n % 10
	//十位：(n / 100) * 10 + (if(k > 19) 10 else if(k < 10) 0 else k - 10 + 1)	k = n % 100
	//百位：(n / 1000) * 100 + (if(k >199) 100 else if(k < 100) 0 else k - 100 + 1)		k = n % 1000
	//后半段简化，我们不去计算i * 2 - 1了，我们只需保证k - i + 1在[0, i]区间内就行了min(max((n mod (i*10))−i+1,0),i)
	public int NumberOf1Between1AndN_Solution(int n) {
	    if(n<=0) return 0;
	    int count = 0;
	    for(int i=1;i<=n;i*=10) {
	    	int deliver = i*10;
	    	count+= (n/deliver)*i + Math.min(Math.max(n%deliver-i+1, 0),i);
	    }
	    return count;
    }
}
