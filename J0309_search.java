package ssk01;

public class J0309_search {
	public static void main(String[] args) {
		int[] arr1 = {14,5,12,8,9,23,17};
		int max;
		int min;
		
		max = arr1[0];
		min = arr1[0];
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>max) {
				max = arr1[i];
			}
			
			if(arr1[i] < min) {
				min = arr1[i];
			}
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
	}
}
