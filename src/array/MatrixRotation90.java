package array;

import java.util.Arrays;

public class MatrixRotation90 {
	public int[][] solution(int[][] a) {
		if(a.length==0) return a;
		int[][] res = new int[a[0].length][a.length];
		int des = a.length-1;
		for(int i=0;i<a.length;i++,des--) {
			for(int j=0;j<a[0].length;j++) {
				res[j][des] = a[i][j];
			}
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		int[][] a = {{1,2,3,4},{5,6,7,8} };
		int[][] res = new MatrixRotation90().solution(a);
		for(int i=0;i<res.length;i++) {
			System.out.println(Arrays.toString(res[i]));
		}
	
	}
}
