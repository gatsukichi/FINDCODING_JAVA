package ssk01;

import java.util.*;

public class Card03 {
	public static void main(String[] args) {
		int cheolsu_card1;
		int cheolsu_card2;
		int computer_card1;
		int computer_card2;
		int cheolsu_score;
		int computer_score;
		int cheolsu_point=30;
		int computer_point=30;
		
		Scanner s= new Scanner(System.in);
		Random r = new Random();
		
		while(true) {
			System.out.print("ö�� ù��° ī�� ���� �Է�(2~10):");
			cheolsu_card1=s.nextInt();
			cheolsu_card2=r.nextInt(9)+2;
			System.out.println("ö�� �ι�° ī�� : " + cheolsu_card2);
			cheolsu_score=(cheolsu_card1+cheolsu_card2)%10;
			
			computer_card1 = r.nextInt(9)+2;
			computer_card2 = r.nextInt(9)+2;
			System.out.println("��ǻ�� ù��° ī��:"+computer_card1);
			System.out.println("��ǻ�� �ι�° ī��:"+computer_card2);
			computer_score=(computer_card1+computer_card2)%10;
			
			System.out.println("ö�� ī�� ���� : " +cheolsu_score);
			System.out.println("��ǻ�� ī�� ����: "+ computer_score);
			
			if(cheolsu_score>computer_score) {
				System.out.println("ö���� �̰���ϴ�.");
				cheolsu_point = cheolsu_point+20;
				computer_point = computer_point-20;
			}else if(cheolsu_score<computer_score) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				computer_point=computer_point+20;
				cheolsu_point=cheolsu_point-20;
			}else {
				System.out.println("�����ϴ�.");
			}
			
			System.out.println("ö���� ��ǻ���� ���� ����");
			System.out.println("ö��: "+cheolsu_point);
			System.out.println("��ǻ�� : "+computer_point);
			
			if(cheolsu_point<0) {
				System.out.println("ö���� ������ 0������ �۾Ƽ� ��������");
				break;
			}else if(computer_point<0) {
				System.out.println("��ǻ���� ������ 0 ������ �۾Ƽ� ���� ����");
				break;
			}else {
				System.out.println("���� ���");
			}
			
		}
		s.close();
	}
}
