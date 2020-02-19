package ssk01;

import java.util.*;

public class J0307_search {
	public static void main(String[] args) {
		int count;
		String str1;
		char[] arr1 = new char[40];
		
		Scanner s= new Scanner(System.in);
		System.out.print("문장 입력: ");
		str1 = s.nextLine();
		arr1[0] = str1.charAt(0);
		System.out.print(arr1[0]+" ");
		
		for(int i =1;i<str1.length();i++) {
			count=0;
			for(int j=0;j<i;j++) {
				if(str1.charAt(i) == str1.charAt(j)) {
					count = count+1;
				}
			}
			if(count < 1) {
				arr1[i] = str1.charAt(i);
				System.out.print(arr1[i]+" ");
			}
		}
		System.out.println("알파벳 만을 구성됨 ");
		s.close();
	}
}
