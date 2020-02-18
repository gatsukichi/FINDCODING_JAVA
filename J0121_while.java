package ssk01;

import java.util.*;

public class J0121_while {
	public static void main(String[] args) {
		int num;
		int sum =0 ;
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		num=s.nextInt();
		
		while(num>0) {
			sum=sum+num;
			num=num-1;
		}
		System.out.println(sum);
		s.close();
	}
}
