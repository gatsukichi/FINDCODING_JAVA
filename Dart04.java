package ssk01;

import java.util.*;

public class Dart04 {
	public static void main(String[] args) {
		int score;
		int goal_score;
		int n_round=0;
		int n_player;
		int gubun;
		int max;
		int winlist_count=0;
		int[] player_score = new int[20];
		int[] winlist = new int[20];
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("다트 게임을 시작합니다");
		System.out.print("게임에 참여할 인원 수 : ");
		n_player=s.nextInt();
		System.out.print("목표 점수 : ");
		goal_score = s.nextInt();
		
		for(int i=0; i<n_player; i++) {
			player_score[i] = 0;
		}
		
		gubun=1;
		while(gubun==1) {
			n_round= n_round+1;
			System.out.println(n_round+ " 라운드 ");
			
			System.out.print("현재 점수 : ");
			for(int i=0; i<n_player;i++) {
				System.out.print(player_score[i]+" " );
			}
			System.out.println(" ");
			
			for(int i = 0;i<n_player;i++) {
				System.out.println("친구"+ (i+1));
				System.out.print("점수 입력 : ");
				score=s.nextInt();
				player_score[i]= player_score[i] + score;
				if(player_score[i] >=goal_score) {
					gubun=0;
				}
			}
		}
		System.out.print("최종 점수:");
		for(int i=0;i<n_player;i++) {
			System.out.print(player_score[i] + " ");
		}
		System.out.println(" ");
		
		max =0;
		for(int i=0;i<n_player;i++) {
			if(max<player_score[i]) {
				max=player_score[i];
			}
		}
		
		for(int i=0;i<n_player; i++) {
			if(player_score[i] ==max) {
				winlist[winlist_count]=i+1;
				winlist_count = winlist_count+1;
			}
		}
		
		System.out.print("최종 우숭자 : ");
		for(int i=0;i<winlist_count;i++) {
			System.out.print("친구" + winlist[i] + " ");
		}
		s.close();
	}
}
