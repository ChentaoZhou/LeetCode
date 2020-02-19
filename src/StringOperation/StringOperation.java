package StringOperation;

public class StringOperation {
	public static String replaceSpace(String s) {
		String result = s.replace(" ", "%20");
		return result;
	}
	
	public String replaceSpace(StringBuffer str) {
        String s = new String(str);
    	String result = s.replace(" ", "%20");
		return result;
    }
	
	
	
	public static String replaceSpace2(String s) {
		char[] origin = new char[s.length()];
		String result="";
		for(int i=0; i<s.length();i++) {
			origin[i] = s.charAt(i);
		}
		for(int i=0; i<origin.length;i++) {
			if(origin[i] == ' ') {
				result+="%20";
			}else {
				result+=origin[i];
			}
		}
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		String s = "We Are Happy";
		System.out.println(replaceSpace2(s));
	}
}
