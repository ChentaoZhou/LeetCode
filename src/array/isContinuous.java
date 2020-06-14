package array;

public class isContinuous {
	public boolean isContinuous(int[] numbers) {
		if(numbers.length==0) return false;
		int len = numbers.length;
		int[] d = new int[14];
		d[0] = -4;
		int max=-1;
		int min =14;
		for(int i=0;i<len;i++) {
			d[numbers[i]]++;
			if(d[numbers[i]]>1) return false;
			if(numbers[i]==0) continue;
			if(numbers[i]>max) max = numbers[i];
			if(numbers[i]<min) min = numbers[i];
		}
		if(max-min<5) return true;
		else return false;
	}
}
