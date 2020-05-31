
public class GCD {
	public int GCD(int m, int n) {
		int p=m, q=n;
		while(p%q!=0) {
			int r = p%q;
			p=q; q =r;
		}
		return q;
	}
}
