package ssk01;

public class J0501_SumMachine {
	public int makeSum(int startValue, int endValue) {
		int start = startValue;
		int end = endValue;
		int sum=0;
		
		for(int i = start ; i<=end; i++) {
			sum = sum+i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		J0501_SumMachine m = new J0501_SumMachine();
		
		int result1 = m.makeSum(1, 10);
		int result2 = m.makeSum(1, 100);
		int result3 = m.makeSum(10, 20);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
