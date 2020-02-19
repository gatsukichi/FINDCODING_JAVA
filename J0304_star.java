package ssk01;

import java.util.*;

public class J0304_star {
	public static void main(String[] args) {
		int len;
		String s_str;
		
		Scanner s= new Scanner(System.in);
		System.out.print("삼각형의 길이 입력:");
		len = s.nextInt();
		
		for(int i = 1; i<=len;i++) {
			s_str="";
			for(int j=1;j<=len;j++) {
				if(j>len-i) {
					s_str=s_str+"*";
				}else {
					s_str = s_str + " ";
				}
			}
			System.out.println(s_str);
		}
		s.close();
	}
}
