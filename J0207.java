package ssk01;

import java.util.*;

public class J0207 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		int stNum; // �л���
		int rank;
		System.out.print("�л����� �Է��Ͻÿ�:");
		stNum=s.nextInt();		
		
		int[] score = new int[stNum];
		
		for(int i=0;i<stNum;i++) {
			System.out.print((i+1)+"�� �л��������� �Է��Ͻÿ� : ");
			score[i]=s.nextInt();
		}
		
		//
		
	
		for(int i=0;i<stNum;i++) {
			
			rank=1;
			for(int j=0;j<stNum;j++) {
				if(score[i]<score[j]) {
					rank=rank+1;
				}
			}
			System.out.println((i+1)+"�� �л��� ���� : " + score[i] + "/ ��� : "+ rank);
		}
		
		
		s.close();
	}
}
