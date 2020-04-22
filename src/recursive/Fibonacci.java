package recursive;

public class Fibonacci {
	public int Fibonacci(int n) {
		if(n<1) return 0;
		if(n<3) {
			return 1;
		}
		else {
			int result = Fibonacci(n-1)+Fibonacci(n-2);
			return result;
		}
	}
	public int jumpFloor(int number) {
		if(number<=1) return number;
		int memo_i=2;
		int memo_i1=1;
		int memo_i2=1;
		for(int i=2;i<=number;i++) {
			memo_i=memo_i1+memo_i2;
			memo_i2 = memo_i1;
			memo_i1 =memo_i;
		}
		return memo_i;
	}
	public int jumpFloor2(int target) {
		if(target <1) {
			return 0;
		}
		if(target == 1) return 1;
		int result = 2*jumpFloor2(target-1);
		return result;
	}

}
