package stringOperation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class PermutationDuplicate {
	public ArrayList<String> solution(String str){
		ArrayList<String> result = permutation(str);
		HashSet<String> res = new HashSet<String>();
		for(String temp: result) res.add(temp);
		result.clear();
		for(String temp:res) result.add(temp);
		result.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char[] chars1=o1.toCharArray();
                char[] chars2=o2.toCharArray();
                int i=0;
                while(i<chars1.length && i<chars2.length){
                    if(chars1[i]>chars2[i]){
                        return 1;
                    }else if(chars1[i]<chars2[i]){
                        return -1;
                    }else{
                        i++;
                    }
                }
                if(i==chars1.length){  //o1到头
                    return -1;
                }
                if(i== chars2.length){ //o2到头
                    return 1;
                }
                return 0;
            }
        });
		return result;
	}
	public ArrayList<String> permutation(String str){
		ArrayList<String> resultList = new ArrayList<String>();
		if(str.length()==1) resultList.add(str);
		for(int i=0;i<str.length();i++) {
			String shortstring;
			String temp;
			shortstring = str.substring(0,i)+str.substring(i+1,str.length());
			ArrayList<String> res= permutation(shortstring);
			for(String tempString:res) {
				temp = str.charAt(i)+tempString;
				resultList.add(temp);
			}
		}
		return resultList;
	}
}
