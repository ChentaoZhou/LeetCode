package stringOperation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BackString {
	   public String solution(){
	        Scanner s = new Scanner(System.in);
	        String a = s.nextLine();
	        int n = Integer.parseInt(s.nextLine());
	        ArrayList<Character> res = new ArrayList<Character>();
	        for(int i=0;i<a.length();i++){
	            res.add(a.charAt(i));
	        }
	        for(int i=0;i<n;i++){
	            int index = s.nextInt();
	            int len = s.nextInt();
	            int pos = index+len-1;
	            if(index<0||index>=a.length()||len>a.length()) {
	                System.out.println("wrong input");
	                break;
	            }
	            Stack<Character> list = new Stack<Character>();
	            for(int j=0; i<len;i++){
	                list.push(a.charAt(j+index));
	            }
	            while(!list.isEmpty()){
	                res.add(pos++,list.pop());
	            }
	        }
	        String result="";
	        for(Character c:res){
	            result+=c;
	        }
	        return result;
	}
}
