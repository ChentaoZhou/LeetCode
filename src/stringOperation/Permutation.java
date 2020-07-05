package stringOperation;

import java.util.ArrayList;

public class Permutation {
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> resultList = new ArrayList<String>();
         if(str.length()==1) resultList.add(str);
         for(int i=0;i<str.length();i++){
             String shortStr = str.substring(0,i) + str.substring(i+1,str.length());
             String temp;
             ArrayList<String> list = Permutation(shortStr);
             for(String part: list){
                 temp = str.charAt(i)+part;
                 resultList.add(temp);
             }
         }
         return resultList;
     }
    public static void main(String[] args) {
    	String s = "bark";
    	ArrayList<String> res = Permutation(s);
    	System.out.println(res);
    }
}
