package ssk01;

public class J0313_sort {
	public static void main(String[] args) {
		int i;
		int didSwap;
		int temp;
		int[] arr1 = {5,9,3,1,8};
		
		for(i=0;i<5;i++) {
			didSwap = 0;
			for(int j=0;j<4;j++) {
				if(arr1[j]>arr1[j+1]) {
					temp=arr1[j+1];
					arr1[j+1]=arr1[j];
					arr1[j]=temp;
					didSwap=1;
				}
			}
			if(didSwap==0) {
				break;
			}
		}
		System.out.println("정렬 후의 리스트");
		for(i=0;i<5;i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
