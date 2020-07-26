
public class HanoiTower {
	public void printHanoi(int n, char fromBar, char toBar, char leisureBar) {
		if(n==1) {
			System.out.println("Move "+n+" form "+fromBar+" to "+ toBar);
			return;
		}
		
		printHanoi(n-1,fromBar, leisureBar,toBar);
		System.out.println("Move "+n+" form "+fromBar+" to "+ toBar);
		printHanoi(n-1,leisureBar,toBar,fromBar);
	}
	public static void main(String[] args) {
		new HanoiTower().printHanoi(4, 'A', 'C', 'B');
	}
}
