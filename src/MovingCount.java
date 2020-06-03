
public class MovingCount {
	int count = 0;
	public void help(int i, int j,int threshold,int rows,int cols,int[][] flag) {
		if(i<0 || i>=rows || j<0 || j>=cols) return;
		if(flag[i][j] == 1) return;
		if(!isSafe(threshold,i,j)) {
			flag[i][j] = 1;
			return;
		}
		flag[i][j] = 1;
		count++;
		help(i-1,j,threshold,rows,cols,flag);
		help(i+1,j,threshold,rows,cols,flag);
		help(i,j+1,threshold,rows,cols,flag);
		help(i,j-1,threshold,rows,cols,flag);
	}

	public int movingCount(int threshold, int rows, int cols)
    {
        int[][] flag = new int[rows][cols];
        help(0,0,threshold,rows,cols,flag);
        return count;
    }
	
	public boolean isSafe(int threshold, int row, int col) {
		int sum = 0;
		while(row>0) {
			sum+=row%10;
			row = row/10;
		}
		while(col>0) {
			sum+=col%10;
			col = col/10;
		}
		if(sum>threshold) return false;
		else return true;
	}	
}
