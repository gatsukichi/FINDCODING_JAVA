package ssk01;

import java.util.*;

public class Dart01 {
	public static void main(String[] args) {
		int score1;
		int score2;
		int score3;
		int tot_score;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("다트 게임을 시작합니다.");
		System.out.print("첫번째 점수 : ");
		score1=s.nextInt();
		System.out.print("두번째 점수 : ");
		score2=s.nextInt();
		System.out.print("세번째 점수 : ");
		score3=s.nextInt();
		
		tot_score = score1 + score2 + score3;
		System.out.println("최종 점수 : " + tot_score);
		
		s.close();
	}
}
