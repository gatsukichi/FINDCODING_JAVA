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
		
		System.out.println("��Ʈ ������ �����մϴ�");
		System.out.print("��ǥ ���� : ");
		goal_score = s.nextInt();
		
		while(true) {
			n_round = n_round+1;
			System.out.println(n_round+"����");
			
			System.out.println("ö�� �Է� ======================");
			System.out.print("���� �Է�: ");
			ch_score=s.nextInt();
			ch_tot_score=ch_tot_score + ch_score;
			System.out.println("ö�� ���� �հ� : " + ch_tot_score);
			
			System.out.println("�μ� �Է� ======================");
			System.out.print("���� �Է�: ");
			mi_score=s.nextInt();
			mi_tot_score=mi_tot_score + mi_score;
			System.out.println("�μ� ���� �հ� : " + mi_tot_score);
			
			if(ch_tot_score>=goal_score || mi_tot_score>=goal_score) {
				break;
			}
		}
		if(ch_tot_score>mi_tot_score) {
			System.out.println("ö���� �̰���ϴ�.");
		}else if(ch_tot_score<mi_tot_score) {
			System.out.println("�μ��� �̰���ϴ�.");
		}else {
			System.out.println("�����ϴ�. ");
		}
		s.close();
	}
}
