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
		
		System.out.println("��Ʈ ������ �����մϴ�. ");
		System.out.println(" ö�� �Է� ===============");
		System.out.print("ù��° ���� : ");
		ch_score1=s.nextInt();
		System.out.print("�ι�° ���� : ");
		ch_score2=s.nextInt();
		System.out.print("����° ���� : ");
		ch_score3=s.nextInt();
		
		ch_tot_score = ch_score1+ch_score2+ch_score3;
		System.out.println("ö�� ���� �հ�:" + ch_tot_score);
		
		System.out.println(" �μ� �Է� ===============");
		System.out.print("ù��° ���� : ");
		mi_score1=s.nextInt();
		System.out.print("�ι�° ���� : ");
		mi_score2=s.nextInt();
		System.out.print("����° ���� : ");
		mi_score3=s.nextInt();
		
		mi_tot_score = mi_score1+mi_score2+mi_score3;
		System.out.println("�μ� ���� �հ�:" + mi_tot_score);
		
		if(ch_tot_score>mi_tot_score) {
			System.out.println("ö���� �̰���ϴ�.");
		}else if(ch_tot_score<mi_tot_score) {
			System.out.println("�μ��� �̰���ϴ�.");
		}else {
			System.out.println("�����ϴ�.");
		}
		s.close();
	}
}
