package stringOperation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkNum {
	public static boolean check(String s) {
		String check = "^[-|\\+]?[0-9]*(\\.)?[0-9]*([e|E][-|\\+]?[0-9]+)?$"; 
    	Pattern regex = Pattern.compile(check);  
    	Matcher matcher = regex.matcher(s);  
    	boolean isMatched = matcher.matches();  
		return isMatched; 
    		
	}
	
	//第二种方法，直接强制转换为数字，判断是否有异常
	    public boolean isNumeric(char[] str) {
	        try {
	            double re = Double.parseDouble(new String(str));
	        } catch (NumberFormatException e) {
	            return false;
	        }
	        return true;
	    }
	
	
	public static void main(String[] args) {
		String s = "1+23";
		System.out.println(check(s));
	}
}


//字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。