package ssk01;

public class J0202_array {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[3];
		
		arr2[0] = 40;
		arr2[1] = 50;
		arr2[2] = 60;
		
		for(int i=0;i<3;i++) {
			System.out.println(arr1[i]);
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(arr2[i]);
		}
	}
}
