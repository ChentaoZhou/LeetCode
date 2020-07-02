public class Solution {
	static int counter = 0;

	public static int movingCount(int threshold, int rows, int cols) {
		int x = 0, y = 0;
		int[][] m = new int[rows][cols];
		return move(m, threshold, 0, 0,rows,cols);
	}

	public static int move(int[][] a, int threshold, int x, int y,int rows, int cols) {
		if (isOk(threshold, x, y,rows,cols) && a[x][y] != -1) {
			counter++;
			System.out.println("x: "+x+" y: "+y+" "+counter);
			a[x][y] = -1;
			move(a, threshold, x-1, y,rows,cols);
			move(a, threshold, x+1, y,rows,cols);
			move(a, threshold, x, y+1,rows,cols);
			move(a, threshold, x, y-1,rows,cols);
		}
		return counter;
	}

	public static boolean isOk(int h,int x,int y,int rows,int cols){
        if(x<0||y<0||x>=rows||y>=cols) return false;
        int res=0;
        String row=x+"";
        String col=y+"";
        for(int i=0;i<row.length();i++){
            char[] temp = {row.charAt(i)};
            res+=Integer.parseInt(new String(temp));
        }
        for(int i=0;i<col.length();i++){
            char[] temp = {col.charAt(i)};
            res+=Integer.parseInt(new String(temp));
        }
        return h>=res;
    }

	public static void main(String[] args) {
		System.out.println(movingCount(15,20,20));
	}
}