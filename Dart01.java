package ssk01;

import java.util.*;

public class Dart01 {
	public static void main(String[] args) {
		int score1;
		int score2;
		int score3;
		int tot_score;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("��Ʈ ������ �����մϴ�.");
		System.out.print("ù��° ���� : ");
		score1=s.nextInt();
		System.out.print("�ι�° ���� : ");
		score2=s.nextInt();
		System.out.print("����° ���� : ");
		score3=s.nextInt();
		
		tot_score = score1 + score2 + score3;
		System.out.println("���� ���� : " + tot_score);
		
		s.close();
	}
}
