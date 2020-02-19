package ssk01;

public class J0203_array {
	public static void main(String[] args) {
		int[] arr1 = {1,3,7,11,15};
		int sum=0;
		
		for(int i=0;i<arr1.length;i++) {
			sum=sum+arr1[i];
		}
		System.out.println(sum);
	}
}
