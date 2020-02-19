package ssk01;

import java.util.*;

public class J0204_array {
	public static void main(String[] args) {
		String str1;
		Scanner s = new Scanner(System.in);
		System.out.print("영어 단어 입력: ");
		str1= s.nextLine();
		
		char[] str2 = new char[str1.length()];
		
		for(int i=0;i<=str1.length()-1;i++) {
			str2[i]=str1.charAt(i);
		}
		
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(str2[i]);
		}
		s.close();
	}
}
