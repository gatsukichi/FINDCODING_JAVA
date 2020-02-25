package ssk01;

import java.util.*;

public class Dart02 {
	public static void main(String[] args) {
		int ch_score1;
		int ch_score2;
		int ch_score3;
		int mi_score1;
		int mi_score2;
		int mi_score3;
		int ch_tot_score;
		int mi_tot_score;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("다트 게임을 시작합니다. ");
		System.out.println(" 철수 입력 ===============");
		System.out.print("첫번째 점수 : ");
		ch_score1=s.nextInt();
		System.out.print("두번째 점수 : ");
		ch_score2=s.nextInt();
		System.out.print("세번째 점수 : ");
		ch_score3=s.nextInt();
		
		ch_tot_score = ch_score1+ch_score2+ch_score3;
		System.out.println("철수 점수 합계:" + ch_tot_score);
		
		System.out.println(" 민수 입력 ===============");
		System.out.print("첫번째 점수 : ");
		mi_score1=s.nextInt();
		System.out.print("두번째 점수 : ");
		mi_score2=s.nextInt();
		System.out.print("세번째 점수 : ");
		mi_score3=s.nextInt();
		
		mi_tot_score = mi_score1+mi_score2+mi_score3;
		System.out.println("민수 점수 합계:" + mi_tot_score);
		
		if(ch_tot_score>mi_tot_score) {
			System.out.println("철수가 이겼습니다.");
		}else if(ch_tot_score<mi_tot_score) {
			System.out.println("민수가 이겼습니다.");
		}else {
			System.out.println("비겼습니다.");
		}
		s.close();
	}
}
