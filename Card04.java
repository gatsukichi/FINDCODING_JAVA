package ssk01;

import java.util.*;

public class Card04 {
	public static void main(String[] args) {
		int[] cheolsu_card = new int[2];
		int[] computer_card = new int[2];
		int cheolsu_score;
		int computer_score;
		int cheolsu_point=100;
		int computer_point=100;
		int game_round=0;
		int count1;
		int point;
		String next_gubun;
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		while(true){
			game_round += 1;
			
			if(game_round>1) {
				System.out.print("��� �Ͻðڽ��ϱ�? y/n : ");
				next_gubun=s.next();
				if(next_gubun.equals("n")) {
					System.out.println("���� ����");
					break;
				}
			}
			System.out.println("=======================");
			System.out.println(game_round + " ���� ");
			System.out.println("=======================");
			
			System.out.print("ö�� ù��° ī�� ���� �Է�(2~10): ");
			cheolsu_card[0] = s.nextInt();
			cheolsu_card[1] = r.nextInt(9)+2;
			
			computer_card[0]=r.nextInt(9)+2;
			computer_card[1]=r.nextInt(9)+2;
			
			System.out.println("ö��ī��[" +cheolsu_card[0] + "," + cheolsu_card[1] + "]");
			System.out.println("��ǻ��ī��[" +computer_card[0] + "," + computer_card[1] + "]");
			
			System.out.println("ī�带 �ٲ� �� �ֽ��ϴ�.");
			System.out.print("���� �Է�(���� ����ŭ �ٲܼ� ����) : ");
			count1 = s.nextInt();
			for(int i=1;i<=count1;i++) {
				cheolsu_card[1] = r.nextInt(9)+2;
				System.out.println("ö��ī��[" +cheolsu_card[0] + "," + cheolsu_card[1] + "]");
				computer_card[1] = r.nextInt(9)+2;
				System.out.println("��ǻ��ī��[" +computer_card[0] + "," + computer_card[1] + "]");
				
				cheolsu_score=(cheolsu_card[0] + cheolsu_card[1])%10;
				computer_score = (computer_card[0] + computer_card[1])%10;
				System.out.println("ö�� ī�� ���� : " + cheolsu_score);
				System.out.println("��ǻ�� ī�� ���� : " + computer_score);
				
				if(i==count1) {
					point=20;
				}else {
					point = 5;
				}
				System.out.println(point + "�� ��");
				
				if(cheolsu_score>computer_score) {
					System.out.println("ö���� �̰���ϴ�.");
					cheolsu_point += point;
					computer_point -= point;
				}else if(cheolsu_score<computer_score) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					cheolsu_point -= point;
					computer_point += point;
				}else {
					System.out.println("�����ϴ�.");
				}
				
				System.out.println("ö���� ��ǻ���� ���� ����  ");
				System.out.println("ö�� : "+ cheolsu_point);
				System.out.println("��ǻ�� : "+ computer_point);
				System.out.println("-----------------------------------------");
			}
			
		}
		s.close();
	}
}
