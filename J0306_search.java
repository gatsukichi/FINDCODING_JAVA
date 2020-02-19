package ssk01;

import java.util.*;

public class J0306_search {
	public static void main(String[] args) {
		String str1;
		String ch;
		int count =0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("문장 입력: ");
		str1 = s.nextLine();
		System.out.print("개수를 셀 알파벳 입력: ");
		ch = s.next();
		
		for(int i=0;i<str1.length();i++) {
			if(ch.equals(""+str1.charAt(i))) {
				count = count +1;
			}
		}
		System.out.println(count+"개");
		s.close();
	}
}
