package ssk01;

import java.util.*;

public class J0207 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		int stNum; // 학생수
		int rank;
		System.out.print("학생수를 입력하시오:");
		stNum=s.nextInt();		
		
		int[] score = new int[stNum];
		
		for(int i=0;i<stNum;i++) {
			System.out.print((i+1)+"번 학생의점수를 입력하시오 : ");
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
			System.out.println((i+1)+"번 학생의 점수 : " + score[i] + "/ 등수 : "+ rank);
		}
		
		
		s.close();
	}
}
