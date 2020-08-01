package stringOperation;

import java.util.Stack;

public class LC151_ReverseString {
    public String reverseWords(String s) {
        String[] list = s.split("\\s+");
        Stack<String> stack = new Stack<>();
        for(int i=0;i<list.length;i++){
            stack.push(list[i]);
        }
        StringBuilder res = new StringBuilder();
         while(!stack.isEmpty()){
            res.append(stack.pop());
            res.append(" ");
        }
        return res.toString().trim();
    }
}
