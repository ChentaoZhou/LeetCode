import java.util.Arrays;

public class Main {
	 static boolean flag = false;
	    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str)
	    {
	        
	        int[][] map = new int[rows][cols];
	        for(int index=0;index<matrix.length;index++){
	            if(matrix[index]==str[0]){
	            	System.out.println("row: "+index/cols+" col: "+index%cols+" P: "+matrix[index]);
	                find(matrix,map,index/cols,index%cols,new String(str));
	            }
	        }
	        return flag;
	    }
	    public static void find(char[] matrix,int[][] map,int row, int col,String str){
	       
	        if(row<0||col<0||row>map.length-1||col>map[0].length-1||map[row][col]==-1) return;
	         int index = row*map[0].length+col;
	        if(str.length()==1 && matrix[index]==str.charAt(0)) {
	            flag = true;
	            return;
	        }
	        if(matrix[index] == str.charAt(0)){
	            str = str.substring(1);
	            map[row][col]=-1;
	            find(matrix,map,row+1,col,str);
	            find(matrix,map,row-1,col,str);
	            find(matrix,map,row,col+1,str);
	            find(matrix,map,row,col-1,str);
	            
	        }
	        map[row][col] = 0;
	    }
	   public static void main(String[] args) {
		   char[] m = {'A','B','C','E','S','F','C','S','A','D','E','E'};
		   char[] n = {'S','E','E'};
		   
		   System.out.println(hasPath(m,3,4,n));
	   }
}
