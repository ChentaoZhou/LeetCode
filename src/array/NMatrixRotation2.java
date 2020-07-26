package array;

public class NMatrixRotation2 {
	public static int[][] solution(int n){
		if(n<0) return null;
		int[][] res = new int[n][n];
		int x=-1,y=-1;
		int input = n;
		n= n-1;
		int counter = 1;
		
		while(n>0) {
			x++;y++;
			for(int i=0;i<n;i++) {
				res[x][y++] = counter++;
			}
			for(int i=0;i<n;i++) {
				res[x++][y] = counter++;
			}
			for(int i=0;i<n;i++) {
				res[x][y--] = counter++;
			}
			for(int i=0;i<n;i++) {
				res[x--][y] = counter++;
			}
			n-=2;
		}
		if(n==0) {
			res[input/2][input/2] = counter;
		}
		return res;
	}
	
	public static void main(String[] args) {
		  int n = 4;
		  int[][] res = solution(n);
		  for(int i = 0; i < n; i++) {
		   for(int j = 0; j < n; j++)
		    System.out.print(String.format("%3d",res[i][j]));
		   System.out.println();
		  }
		  
		 }
}
