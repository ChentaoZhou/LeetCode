import java.util.ArrayList;

public class FindContinuousSequence {
	public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		int bound = sum/2;
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int l=1, r=1;
		while(l<=sum/2 && 0<l &&r<=sum) { 
			System.out.println("l: "+l);
			System.out.println("r: "+r);
			System.out.println("sum: "+sum);
			int res = (l+r)*(r-l+1)/2;
			if(res<sum) {
				r++;
			}else if(res>sum) {
				l++;
			}else {
				System.out.println("get one");
				System.out.println("l: "+l);
				System.out.println("r: "+r);
				
				ArrayList<Integer> temp = new ArrayList<Integer>();
				for(int i=l;i<=r;i++) {
					temp.add(i);
					System.out.println(": "+l);
				}
				result.add(temp);
				r++;
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int s = 9;
		System.out.println(FindContinuousSequence(s));
	}
}
