package ssk01;

import java.util.*;

public class J0306_search {
	public static void main(String[] args) {
		String str1;
		String ch;
		int count =0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		str1 = s.nextLine();
		System.out.print("������ �� ���ĺ� �Է�: ");
		ch = s.next();
		
		for(int i=0;i<str1.length();i++) {
			if(ch.equals(""+str1.charAt(i))) {
				count = count +1;
			}
		}
		System.out.println(count+"��");
		s.close();
	}
}
