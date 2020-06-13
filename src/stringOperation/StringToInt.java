package stringOperation;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInt {
	  public static int StrToInt(String str) {
		  
		  	String check = "^[-|\\+]?[0-9]+$"; 
	    	Pattern regex = Pattern.compile(check);  
	    	Matcher matcher = regex.matcher(str);  
	    	boolean isMatched = matcher.matches(); 
	    	if(isMatched == false ||str.equals("0")) return 0;
	    	
	    	long result = 0;
	    	int intresult ;
	        LinkedList<Character> list = new LinkedList<Character>();
	        for(int i=0;i<str.length();i++){
	        	list.add(str.charAt(i));
	        }
	        
	        System.out.print(list.getLast());
	        int size = list.size();
	        for(int i=0;i<size;i++) {
	        	if(list.getLast().equals('+')){
	        		
	        	}else if(list.getLast().equals('-')) {
	        		result *=-1;	 
	        	}else {
	        		result+=Integer.parseInt(""+list.removeLast())*Math.pow(10, i);
	        	}
	        	
	        }
	        if(result > Integer.MAX_VALUE||result<Integer.MIN_VALUE) {
	        	return 0;
	        }else{
	        	 intresult = (int)result;
	        }
	        
			return intresult;
			
	    }
	  
	  
	  
	  public static void main(String[] args) {
			String s = "-319881239";
			System.out.println(StrToInt(s));
		}
}
