package stringOperation;

import java.util.Stack;

public class DeleteabInString {
	public String deleteab(String str) {
		if(str==null||str.length()==0||str.equals("")) return str;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			if(!stack.isEmpty() && str.charAt(i)=='b') {
				if(stack.peek()=='a') {
					stack.pop();
					continue;
				}
			}
			stack.push(str.charAt(i));
		}
		StringBuilder res = new StringBuilder();
		while(!stack.isEmpty()) {
			res.append(stack.pop());
		}
		return res.reverse().toString();
	}
	public static void main(String[] args) {
		String s= "abdkfcefbikbaabbsdsbb";
		String str = "abababababababababb";
		System.out.println(new DeleteabInString().deleteab(str));
	}
}
