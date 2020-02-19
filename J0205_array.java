package ssk01;

import java.util.Arrays;
import java.util.Scanner;

public class J0205_array {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int[] grades = new int[5];
		
		for(int i=0; i<grades.length;i++) {
			System.out.print(i+"점수 입력 :");
			grades[i]=s.nextInt();
		}
		System.out.println("입력된 점수");
		System.out.println(Arrays.toString(grades));
	
		//평균 점수
		int sum=0;
		for(int i=0;i<grades.length;i++) {
			sum= sum+ grades[i];
		}
		System.out.println("평균:"+sum/(float)grades.length);
		
		//최고점수
		int max=0;
		for(int i=0;i<grades.length;i++) {
			if(grades[i]>max) {
				max=grades[i];
			}
		}
		System.out.println("최고점수 : "+max);
		
		//최저 점수
		int min=100;
		for(int i=0;i<grades.length;i++) {
			if(grades[i]<min) {
				min=grades[i];
			}
		}
		System.out.println("최저점수 : "+min);
		s.close();
	}
}