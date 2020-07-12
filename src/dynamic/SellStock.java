package dynamic;

public class SellStock {
	public int maxProfit(int[] prices) {
		int buyOne = Integer.MAX_VALUE;
		int buyTwo = Integer.MAX_VALUE;
		int sellOne = 0;
		int sellTwo = 0;
		 for(int i=0;i<prices.length;i++) {
			 int p = prices[i];
			 buyOne = Math.min(buyOne, p);
			 sellOne = Math.max(sellOne, p-buyOne);
			 buyTwo = Math.min(buyTwo, p-sellOne);
			 sellTwo = Math.max(sellTwo, p-buyTwo);
		 }
		 return sellTwo;
	}
}
