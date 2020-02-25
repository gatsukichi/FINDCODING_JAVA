package ssk01;

import java.util.*;

public class J0502_Calculator {
	public int plus(int a,int b) {
		int result;
		result = a+b;
		return result;
	}
	
	public int minus(int a,int b) {
		int result;
		result= a-b;
		return result;
	}
	
	public int multiply(int a,int b) {
		int result;
		result = a*b;
		return result;
	}
	
	public double divide(int a, int b) {
		double result2;
		result2 =(double)a/(double)b;
		return result2;
	}
	
	public static void main(String[] args) {
		int a;
		int b;
		int cal;
		int result;
		double result2;
		
		Scanner s= new Scanner(System.in);
		J0502_Calculator c = new J0502_Calculator();
		
		System.out.print("첫번째 숫자 입력 : ");
		a = s.nextInt();
		System.out.print("두번째 숫자 입력: ");
		b = s.nextInt();
		System.out.print("번호입력(1:더하기 2:빼기 3:곱하기 4:나누기) : ");
		cal = s.nextInt();
		
		if(cal==1) {
			result = c.plus(a,b);
			System.out.println("더하기 결과 : " +result);
		}else if(cal==2) {
			result =c.minus(a, b);
			System.out.println("빼기 결과 : " +result);
		}else if(cal==3) {
			result =c.multiply(a, b);
			System.out.println("곱하기 결과 : " +result);
		}else {
			result2 = c.divide(a, b);
			System.out.printf("나누기 결과 : %.2f", result2);
		}
		s.close();
	}
}
