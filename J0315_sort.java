package ssk01;

public class J0315_sort {
	public static void main(String[] args) {
		int[] arr1 = {4,2,3,8,7,1};
		int min_i;
		int temp;
		
		for(int i=0;i<6;i++) {
			min_i=i;
			for(int j=i+1;j<6;j++) {
				if(arr1[min_i]>arr1[j]) {
					min_i=j;
				}
			}
			temp=arr1[min_i];
			arr1[min_i]=arr1[i];
			arr1[i]=temp;
		}
		
		for(int m=0;m<6;m++) {
			System.out.print(arr1[m]+ " ");
		}
	}
}
