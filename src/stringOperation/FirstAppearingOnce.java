package stringOperation;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstAppearingOnce {
	// Insert one char from stringstream
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	ArrayList<Character> list = new ArrayList<Character>();
	public void Insert(char ch) {
		list.add(ch);
		if(!map.containsKey(ch)) {
			map.put(ch, 1);
		}else {
			map.replace(ch, map.get(ch),  map.get(ch)+1);
		}
		
	}

	// return the first appearence once char in current stringstream
	public char FirstAppearingOnce() {
		if(list.isEmpty()) return '#';
		for(Character c:list) {
			if(map.get(c)==1) {
				return c;
			}
		}
		return '#';
	}
}
