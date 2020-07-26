package stringOperation;

import java.util.Arrays;

public class JZ49_StringToInt {
	public int StrToInt(String str) {
		if(str.length()<1 || str.equals("") || str == null) return 0;
		char[] strs = str.toCharArray();
		int flag = 1;
		if(!Character.isDigit(strs[0])) {
			if(strs[0]=='+') {
				strs = str.substring(1).toCharArray();
			}else if(strs[0]=='-') {
				flag = -1;
				strs = str.substring(1).toCharArray();
			}
			else return 0;
		}
		long result =0;
		int length = strs.length;
		System.out.println(Arrays.toString(strs));
		System.out.println(flag);
		for(int i=length-1;i>=0;i--) {
			if(Character.isDigit(strs[i])) {
				int multiple = length-i-1;
				result+= flag*Character.getNumericValue(strs[i])*(multiple==0?1:(Math.pow(10, multiple)));
				System.out.println("multiple: "+multiple+" strs[i]: "+strs[i]+" result: "+result);
	
			}else return 0;
		}
		if (result > Integer.MAX_VALUE||result < Integer.MIN_VALUE) return 0;
		return (int)result;
	}
	public static void main(String[] args) {
		String s = "1a33";
		System.out.println(new JZ49_StringToInt().StrToInt(s) );
	}
	
	
}
