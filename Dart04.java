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
		
		System.out.println("��Ʈ ������ �����մϴ�");
		System.out.print("���ӿ� ������ �ο� �� : ");
		n_player=s.nextInt();
		System.out.print("��ǥ ���� : ");
		goal_score = s.nextInt();
		
		for(int i=0; i<n_player; i++) {
			player_score[i] = 0;
		}
		
		gubun=1;
		while(gubun==1) {
			n_round= n_round+1;
			System.out.println(n_round+ " ���� ");
			
			System.out.print("���� ���� : ");
			for(int i=0; i<n_player;i++) {
				System.out.print(player_score[i]+" " );
			}
			System.out.println(" ");
			
			for(int i = 0;i<n_player;i++) {
				System.out.println("ģ��"+ (i+1));
				System.out.print("���� �Է� : ");
				score=s.nextInt();
				player_score[i]= player_score[i] + score;
				if(player_score[i] >=goal_score) {
					gubun=0;
				}
			}
		}
		System.out.print("���� ����:");
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
		
		System.out.print("���� ����� : ");
		for(int i=0;i<winlist_count;i++) {
			System.out.print("ģ��" + winlist[i] + " ");
		}
		s.close();
	}
}
