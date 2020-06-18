import java.util.ArrayList;

public class Permutation {
	public static ArrayList<String> permutations(String s) {
		ArrayList<String> resultsList = new ArrayList<String>();
		if (s.length() == 1)
			resultsList.add(s);
		for (int i = 0; i < s.length(); i++) {
			String shortString;
			String tempWord;
			shortString = s.substring(0, i) + s.substring(i + 1, s.length());
			ArrayList<String> shortResultsList = permutations(shortString);
			for (String tempString : shortResultsList) {
				tempWord = s.charAt(i) + tempString;
				resultsList.add(tempWord);
			}
		}
		return resultsList;
	}
	public static void main(String[] args) {
		String s = "bark";
		System.out.println(permutations(s));
	}
}
