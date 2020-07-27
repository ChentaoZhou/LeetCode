
public class NewCompiler {
	/**
	 * n:the number of different word
	 * l: the max length of the composite
	 * **/
	public long solution(int n,int l) {
		long res = n;
		long sum =n;
		for(int i=1;i<l;i++) {
			res = (res*n)%1000000007;
			sum+=res;
			sum = sum%1000000007;
		}
		return sum;
	}
	public static void main(String[] args) {
		long res = new NewCompiler().solution(100, 15);
		System.out.println(res);
	}
}
