package array;

import java.util.HashSet;

public class Duplicate {
	public boolean duplicate(int numbers[],int length,int [] duplication) {
			HashSet<Integer> set = new HashSet<Integer>();
			try {
			for(int i=0; i<numbers.length;i++) {
				if(!set.add(numbers[i])) {
					duplication[0]=numbers[i];
					return true;
				}
			}
			}catch(Exception e) {
				return false;
			}
			return false;
	}
}
