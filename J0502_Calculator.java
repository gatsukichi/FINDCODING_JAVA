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
		
		System.out.print("ù��° ���� �Է� : ");
		a = s.nextInt();
		System.out.print("�ι�° ���� �Է�: ");
		b = s.nextInt();
		System.out.print("��ȣ�Է�(1:���ϱ� 2:���� 3:���ϱ� 4:������) : ");
		cal = s.nextInt();
		
		if(cal==1) {
			result = c.plus(a,b);
			System.out.println("���ϱ� ��� : " +result);
		}else if(cal==2) {
			result =c.minus(a, b);
			System.out.println("���� ��� : " +result);
		}else if(cal==3) {
			result =c.multiply(a, b);
			System.out.println("���ϱ� ��� : " +result);
		}else {
			result2 = c.divide(a, b);
			System.out.printf("������ ��� : %.2f", result2);
		}
		s.close();
	}
}
