package ssk01;

import java.util.*;

public class Card01 {
	public static void main(String[] args) {
		int card1;
		int card2;
		int card_score;
		
		Scanner s= new Scanner(System.in);
		
		System.out.print("ù��° ī�� ���� �Է� (2~10) : ");
		card1 = s.nextInt();
		System.out.print("�ι�° ī�� ���� �Է� (2~10) : ");
		card2 = s.nextInt();
		
		card_score = (card1+card2)%10;
		
		System.out.println("ù��° ī�� ���� : " + card1);
		System.out.println("�ι�° ī�� ���� : " + card2);
		System.out.println("ī������ : " + card_score);
		
		s.close();
	}

}
