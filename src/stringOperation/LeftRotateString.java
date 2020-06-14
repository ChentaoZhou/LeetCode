package stringOperation;

public class LeftRotateString {
	public String LeftRotateString2(String str, int n) {
		if(str.trim().equals("")) return str;
		String part1 = str.substring(0, n);
		String part2 = str.substring(n);
		return part2+part1;
	}
	
	public String LeftRotateString(String str, int n) {
		int len = str.length();
		if(str.trim().equals("")) return str;
		n = n%len;
		str += str;
		return str.substring(n, len+n);
	}
}
