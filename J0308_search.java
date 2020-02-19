package ssk01;

import java.util.*;

public class J0308_search {
	public static void main(String[] args) {
		int count;
		int count2;
		String str1;
		
		Scanner s = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		str1 = s.nextLine();
		char[] arr1 = new char[str1.length()];
		arr1[0] =str1.charAt(0);
		
		for(int i=1;i<str1.length();i++) {
			count = 0;
			for(int j=0;j<i;j++) {
				if(str1.charAt(i)==str1.charAt(j)) {
					count=count+1;
				}
			}
			if(count<1) {
				arr1[i] = str1.charAt(i);
			}
		}
		
		for(int m=0;m<arr1.length;m++) {
			count2 = 0;
			for(int n=0;n<str1.length();n++) {
				if(arr1[m]==str1.charAt(n)) {
					count2 = count2+1;
				}
			}
			if(count2>0) {
				System.out.println(arr1[m]+"의 개수 : " + count2);
			}
		}
		s.close();
	}
}
