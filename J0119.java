package ssk01;

import java.util.*;


public class J0119 {
	public static void main(String[] args) {
		double total; //����
		int year; // ��
		double rate; // ������
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		total = s.nextDouble();
		
		System.out.print("���� �Է��Ͻÿ� : ");
		year = s.nextInt();
		
		System.out.print("������ �Է��Ͻÿ� : ");
		rate = s.nextDouble();
		rate = rate/100;
		
		
		for(int i = 0; i<year ;i++) {
			total = total + (total*rate);
			System.out.print((i+1)+"���� �ݾ� ");
			System.out.printf("%.2f �� \n",total);
		}
		
		s.close();
	}
}
