package Array;

import java.util.Arrays;

public class multipleArray {
	public static int[] multiply(int[] A) {
		int[] B = new int[A.length];
		for(int i=0;i<B.length;i++) B[i] =1;
		for (int i = 0; i < B.length; i++) {
			for(int j=0;j<A.length;j++) {
				if(i==j)continue;
				else B[i] *=A[j];
			}
		}
		return B;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = multiply(a);
		
	}
}
