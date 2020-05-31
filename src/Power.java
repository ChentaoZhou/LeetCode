
public class Power {
	public double power(double base, int exponent) {
       
//        double result = Math.pow(base, exponent);
//		return result;
		double p =1;  
		int m = exponent;
		double q=base;
		if(m<0) {
			m = -m;
			q = 1/q;
		}
		while(m>0) {
			if(m%2!=0) {
				p = p*q;
			}
			m = m/2;
			q=q*q;
		}
		return p;
	  }
}
