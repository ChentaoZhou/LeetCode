package stringOperation;

import java.util.HashMap;


public class FirstNotRepeatingChar {
	public int FirstNotRepeatingChar(String str) {
		HashMap<Character,Integer> list = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			if(list.containsKey(str.charAt(i))) {
				list.replace(str.charAt(i), list.get(str.charAt(i))+1);
			}else {
				list.put(str.charAt(i), 1);
			}
		}
		for(int i=0;i<str.length();i++) {
			if(list.get(str.charAt(i))==1) {
				return i;
			}
		}
		return -1;
	}
}
