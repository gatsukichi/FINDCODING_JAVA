package ssk01;

import java.util.*;

public class J0201_nextLine {
	public static void main(String[] args) {
		String str1;
		
		Scanner s= new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		str1=s.nextLine();
		System.out.println(str1);
		s.close();
	}
}
