package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LC71_SimplifyPath {
	public String simplifyPath1(String path) {
		if(path.length()==0) return path;
		String[] strs = path.split("/");
		ArrayList<String> res = new ArrayList<String>();
		for(int i=0;i<strs.length;i++) {
			if(strs[i].equals("")|| strs[i].equals(".") || (strs[i].equals("..") && res.size()==0)) continue;
			else if((strs[i].equals("..") && res.size()>0)) {
				res.remove(res.size()-1);
			}else {
				res.add(strs[i]);
			}
		}
		System.out.println(res);
		StringBuilder result = new StringBuilder();
		for(String s:res) {
			result.append("/");
			result.append(s);
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String s ="/home//foo/";
		
		System.out.println(new LC71_SimplifyPath().simplifyPath1(s));
	}
}
