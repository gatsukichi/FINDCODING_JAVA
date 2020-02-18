package ssk01;

import java.util.*;

public class J0109 {

	public static void main(String[] args) {
		int a,b;
		
		Scanner s= new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하시오 : ");
		a=s.nextInt();
		System.out.print("두번째 숫자를 입력하시오 : ");
		b=s.nextInt();
		
		if((a-b)==1 || (a-b)==-1) {
			System.out.println("두 수는 연속된 수입니다.");
		}else {
			System.out.println("두 수는 연속된 수가 아닙니다.");
		}
		
		s.close();	
	}
}