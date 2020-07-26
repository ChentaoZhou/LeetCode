package array;

import java.util.ArrayList;

public class NMatrixXXX {
	public static ArrayList<Integer> solution(int[][] matrix){
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(matrix.length==0||matrix[0].length==0) return res;
		int start1=0,start2=0,end1 = matrix.length-1,end2 = matrix[0].length-1;
		while(start1<=end1 && start2<=end2) {
			print(matrix,res,start1++,start2++,end1--,end2--);
		}
		return res;
		
	}
	public static void print(int[][] matrix, ArrayList<Integer> res, int start1,int start2,int end1,int end2) {
		if(start1 == end1) {
			while(start2<=end2) res.add(matrix[start1][start2++]);
		}
		if(start2 == end2) {
			while(start1<=end1) res.add(matrix[start1++][start2]);
		}
		else {
			int tempstart2 = start2;
			while(tempstart2<=end2) {
				System.out.println("1: "+matrix[start1][tempstart2]);
				res.add(matrix[start1][tempstart2++]);
				
			}

			int tempstart1 = start1+1;
			while(tempstart1<=end1) {
				System.out.println("2: "+matrix[tempstart1][end2]);
				res.add(matrix[tempstart1++][end2]);
			}
			int tempend2 = end2-1;
			while(tempend2>=start2) {
				System.out.println("3: "+matrix[end1][tempend2]);
				res.add(matrix[end1][tempend2--]);
			}
			int tempend1 = end1-1; 
			while(tempend1>=start1+1) {
				System.out.println("4: "+matrix[tempend1][start2]);
				res.add(matrix[tempend1--][start2]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5,6,7,8},{9,10,11,12,13,14,15,16}};
		ArrayList<Integer> res =solution(a);
		System.out.println(res);
	}
	
	
	
	
	
	
	
	
}
