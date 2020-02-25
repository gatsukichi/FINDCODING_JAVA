package ssk01;

import java.util.*;

public class Dart03 {
	public static void main(String[] args) {
		int ch_score;
		int mi_score;
		int ch_tot_score=0;
		int mi_tot_score=0;
		int goal_score;
		int n_round=0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("다트 게임을 시작합니다");
		System.out.print("목표 점수 : ");
		goal_score = s.nextInt();
		
		while(true) {
			n_round = n_round+1;
			System.out.println(n_round+"라운드");
			
			System.out.println("철수 입력 ======================");
			System.out.print("점수 입력: ");
			ch_score=s.nextInt();
			ch_tot_score=ch_tot_score + ch_score;
			System.out.println("철수 점수 합계 : " + ch_tot_score);
			
			System.out.println("민수 입력 ======================");
			System.out.print("점수 입력: ");
			mi_score=s.nextInt();
			mi_tot_score=mi_tot_score + mi_score;
			System.out.println("민수 점수 합계 : " + mi_tot_score);
			
			if(ch_tot_score>=goal_score || mi_tot_score>=goal_score) {
				break;
			}
		}
		if(ch_tot_score>mi_tot_score) {
			System.out.println("철수가 이겼습니다.");
		}else if(ch_tot_score<mi_tot_score) {
			System.out.println("민수가 이겼습니다.");
		}else {
			System.out.println("비겼습니다. ");
		}
		s.close();
	}
}
