package ssk01;

import java.util.Scanner;

public class J0301_star {
	public static void main(String[] args) {
		int w;
		int h;
		String s_str;
		
		Scanner s = new Scanner(System.in);
		System.out.print("가로 길이 입력: ");
		w=s.nextInt();
		System.out.print("세로 길이 입력: ");
		h=s.nextInt();
		
		for(int i=1;i<=h;i++) {
			s_str="";
			for(int j=1;j<=w;j++) {
				s_str = s_str+ "*";
			}
			System.out.println(s_str);
		}
		s.close();
	}
}
