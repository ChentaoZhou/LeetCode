
public class Sqr {
	public static double sqr(int a) {
		double x1 = 1, x2;
		x2 = x1/2.0+a/(2*x1);
		
		while(Math.abs(x1-x2)>1e-4) {
			x1 = x2;
			x2 = x1/2.0+a/(2*x1);
		}
		return x2;
	}
}
