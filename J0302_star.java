package ssk01;

import java.util.*;

public class J0302_star {
	public static void main(String[] args) {
		int len;
		String s_str;
		
		Scanner s = new Scanner(System.in);
		System.out.print("�ﰢ���� �����Է� : ");
		len = s.nextInt();
		
		for(int i=1;i<=len ; i++) {
			s_str="";
			for(int j=1;j<i+1;j++) {
				s_str = s_str + "*";
			}
			System.out.println(s_str);
		}
		s.close();
	}
}
