package ssk01;

import java.util.Arrays;
import java.util.Scanner;

public class J0205_array {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int[] grades = new int[5];
		
		for(int i=0; i<grades.length;i++) {
			System.out.print(i+"���� �Է� :");
			grades[i]=s.nextInt();
		}
		System.out.println("�Էµ� ����");
		System.out.println(Arrays.toString(grades));
	
		//��� ����
		int sum=0;
		for(int i=0;i<grades.length;i++) {
			sum= sum+ grades[i];
		}
		System.out.println("���:"+sum/(float)grades.length);
		
		//�ְ�����
		int max=0;
		for(int i=0;i<grades.length;i++) {
			if(grades[i]>max) {
				max=grades[i];
			}
		}
		System.out.println("�ְ����� : "+max);
		
		//���� ����
		int min=100;
		for(int i=0;i<grades.length;i++) {
			if(grades[i]<min) {
				min=grades[i];
			}
		}
		System.out.println("�������� : "+min);
		s.close();
	}
}