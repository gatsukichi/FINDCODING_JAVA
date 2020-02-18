package ssk01;

import java.util.*;


public class J0119 {
	public static void main(String[] args) {
		double total; //원금
		int year; // 연
		double rate; // 연이율
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("원금을 입력하시오 : ");
		total = s.nextDouble();
		
		System.out.print("연을 입력하시오 : ");
		year = s.nextInt();
		
		System.out.print("이율을 입력하시오 : ");
		rate = s.nextDouble();
		rate = rate/100;
		
		
		for(int i = 0; i<year ;i++) {
			total = total + (total*rate);
			System.out.print((i+1)+"년차 금액 ");
			System.out.printf("%.2f 원 \n",total);
		}
		
		s.close();
	}
}
