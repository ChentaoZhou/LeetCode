package stringOperation;

import java.util.Stack;

public class ReverseSentence {
	public static String ReverseSentence(String str) {
		if(str.trim().equals("")) return str;
		String[] strs = str.split(" ");
		Stack<String> res = new Stack<String>();
		for(int i=0;i<strs.length;i++) {
			res.push(strs[i]);
		}
		String result = "";
		while(!res.isEmpty()) {
			result+=res.pop()+" ";
		}
		
		return (String) result.subSequence(0, result.length()-1);
	}
	public static void main(String[] args) {
		String s = "";
		System.out.println(ReverseSentence(s));
	}
}
