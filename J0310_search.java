package ssk01;

import java.util.*;


public class J0310_search {
	public static void main(String[] args) {
		int[] arr1 = {5,16,27,33,41};
		int f_num;
		int idx;
		
		Scanner s = new Scanner(System.in);
		System.out.print("ã�� ���� �Է�: ");
		f_num = s.nextInt();
		
		idx =-1;
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i] ==f_num) {
				idx=i;
			}
		}
		if(idx==-1) {
			System.out.println("ã�� ���ڰ� �����ϴ�.");
		}else {
			System.out.println("ã�� ���ڴ� "+idx+"�� �迭�濡 �ֽ��ϴ�.");
		}
		s.close();
	}

}
