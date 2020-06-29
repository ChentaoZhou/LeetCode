package array;

public class NMatrixRotation {
	//这个新算法的思路是，因为是正方形矩阵，每一个循环打出4次相同的长度，比如4*4矩阵，第一次循环每个边
	//打出3个数字，正好构成第一圈。
	public static int[][] solution(int n){
		if(n<=0) return null;
		int[][] res = new int[n][n];
		int input = n;//用在最后补中间一个值用
		int counter = 1;//打出来的值
		int x= -1;
		int y = n;		// x,y 为起始坐标，循环中的起始坐标为(0，n-1)
		n = n-1;		//n为一次循环要打出的数量
		while(n>0) {
			x++;
			y--;	//打完一圈转移到下一圈起始位置
			//从右上 到 右下
			for(int i =0;i<n;i++) {
				res[x++][y] = counter++;
			}
			//从右下 到 左下
			for(int i=0;i<n;i++) {
				res[x][y--] = counter++;
			}
			//从左下 到 左上
			for(int i=0;i<n;i++) {
				res[x--][y] =counter++;
			}
			//从左上 到 右上
			for(int i =0;i<n;i++) {
				res[x][y++] = counter++;
			}
			n-=2;		//下一循环 横向，纵向各少两层，所以每边长度减2
		}
		if(n==0) {//如果最后最中心有一个点，不构成环，需要额外补上。
			res[input/2][input/2] = counter++;	//这个点一定是矩阵最中心
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		  int n = 6;
		  int[][] res = solution(n);
		  for(int i = 0; i < n; i++) {
		   for(int j = 0; j < n; j++)
		    System.out.print(String.format("%3d",res[i][j]));
		   System.out.println();
		  }
		  
		 }
}
