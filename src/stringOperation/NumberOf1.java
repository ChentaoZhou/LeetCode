package stringOperation;

public class NumberOf1 {
	public int NumberOf1(int n) {
		String bin = Integer.toBinaryString(n);
		int total = 0;
		for(int i=0;i<bin.length();i++) {
			if(bin.charAt(i) == '1') {
				total++;
			}
		}
		return total;
	}
}
