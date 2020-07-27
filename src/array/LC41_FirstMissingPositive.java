package array;

import java.util.Arrays;

public class LC41_FirstMissingPositive {
	public int firstMissingPositive1(int[] A) {
		int i=0;
		while(i<A.length) {
			if(A[i]==i+1 || A[i]<=0 ||A[i]>A.length) {
				i++;
			}
			else if(A[A[i]-1] != A[i]) {
				System.out.println(i);
				int temp = A[i];
				A[i] = A[A[i]-1];
				A[temp-1] = temp;
			}else i++;
		}
		
		System.out.println(Arrays.toString(A));
		for(i=0;i<A.length;i++) {
			if(A[i]!=i+1) {
				break;
			}
		}
		return i+1;
	}
	public int firstMissingPositive(int[] A) {
		int i = 0;
		while (i < A.length) {
			if (A[i] == i + 1 || A[i] <= 0 || A[i] > A.length)
				i++;
			else if (A[A[i] - 1] != A[i])
				swap(A, i, A[i] - 1);
			else
				i++;
		}
		i = 0;
		for (i = 0; i < A.length; i++) {
			if (A[i] != i + 1) {
				break;
			}
		}
		return i + 1;
	}

	private void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	public static void main(String[] args) {
		int[] a = { 3, 4, -1, 1 };
		System.out.println(new LC41_FirstMissingPositive().firstMissingPositive1(a));
	}
}
