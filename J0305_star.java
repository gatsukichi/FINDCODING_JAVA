package ssk01;

import java.util.*;

public class J0305_star {
	public static void main(String[] args) {
		int len;
		int n=0;
		String s_str;
		
		Scanner s = new Scanner(System.in);
		System.out.print("삼각형 길이 입력: ");
		len=s.nextInt();
		
		for(int i=1;i<=len;i++) {
			s_str="";
			for(int j=1; j<=len;j++) {
				if(j>n) {
					s_str = s_str +"*";
				}else {
					s_str = s_str + " ";
				}
			}
			System.out.println(s_str);
			n=n+1;
		}
		s.close();
	}
}
