package ssk01;

import java.util.*;

public class J0109 {

	public static void main(String[] args) {
		int a,b;
		
		Scanner s= new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ� : ");
		a=s.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ� : ");
		b=s.nextInt();
		
		if((a-b)==1 || (a-b)==-1) {
			System.out.println("�� ���� ���ӵ� ���Դϴ�.");
		}else {
			System.out.println("�� ���� ���ӵ� ���� �ƴմϴ�.");
		}
		
		s.close();	
	}
}