package ssk01;

import java.util.*;

public class Card02 {
	public static void main(String[] args) {
		int cheolsu_card1;
		int cheolsu_card2;
		int minsu_card1;
		int minsu_card2;
		int cheolsu_score;
		int minsu_score;
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("ö�� ù��° ī�� ���� �Է�(2~10): ");
		cheolsu_card1=s.nextInt();
		cheolsu_card2=r.nextInt(9)+2;
		System.out.println("ö�� �ι�° ī�� : " +cheolsu_card2);
		cheolsu_score = (cheolsu_card1 + cheolsu_card2)%10;
		
		System.out.print("�μ� ù��° ī�� ���� �Է�(2~10): ");
		minsu_card1=s.nextInt();
		minsu_card2=r.nextInt(9)+2;
		System.out.println("�μ� �ι�° ī�� : " +minsu_card2);
		minsu_score = (minsu_card1 + minsu_card2)%10;
		
		System.out.println("ö�� ī�� ���� : " + cheolsu_score);
		System.out.println("�μ� ī�� ���� : " + minsu_score);
		
		if(cheolsu_score>minsu_score) {
			System.out.println("ö���� �̰���ϴ�.");
		}else if(cheolsu_score<minsu_score) {
			System.out.println("�μ��� �̰���ϴ�.");
		}else {
			System.out.println("�����ϴ�.");
		}
		s.close();
	}
}
