
public class HasPath {

	public boolean help(char[] matrix, int i, int j, int rows, int cols, boolean[] flag,char[] str,int k) {
		int index = i*cols +j;
		if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index]!=str[k] || flag[index] == true)
			return false;
		//如果已经是最后一个，对上了，返回true
		if(k == str.length-1) return true;
		//将目前所在位置标记为走过了，设置为true
		flag[index] = true;
		
		//回溯查找四个方向，递归查找，找到了就给k+1，没有就回退之前的位置
		if(		help(matrix, i-1, j, rows,cols,flag,str,k+1) || 
				help(matrix, i+1, j, rows,cols,flag,str,k+1) || 
				help(matrix, i, j-1, rows,cols,flag,str,k+1) || 
				help(matrix, i, j+1, rows,cols,flag,str,k+1)
				) {
			return true;
		}
		flag[index] = false;

		return false;
	}

	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		
		boolean[] flag = new boolean[matrix.length];
		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(help(matrix, i,j,rows,cols,flag,str,0)) {
					return true;
				}
			}
		}
		return false;
	}
}
