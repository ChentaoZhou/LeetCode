package dynamic;

import java.util.ArrayList;

public class cutRope {
	  public int cutRope(int target) {
		  if(target == 2) return 1;
		  if(target == 3) return 2;
		  int[] results = new int[62];
		  results[0] = 0;
		  results[1] = 1;
		  results[2] = 2;
		  results[3] = 3;
		  results[4] = 4;
		  
		  
		  for(int i = 5;i<=target;i++) {
			  for(int j = 1;j<i;j++) {
				  results[i] = Math.max(results[i], j*results[i-j]); 
			  }
			  
		  }
		return results[target];
	    }
}
