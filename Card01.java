package ssk01;

import java.util.*;

public class Card01 {
	public static void main(String[] args) {
		int card1;
		int card2;
		int card_score;
		
		Scanner s= new Scanner(System.in);
		
		System.out.print("첫번째 카드 숫자 입력 (2~10) : ");
		card1 = s.nextInt();
		System.out.print("두번째 카드 숫자 입력 (2~10) : ");
		card2 = s.nextInt();
		
		card_score = (card1+card2)%10;
		
		System.out.println("첫번째 카드 숫자 : " + card1);
		System.out.println("두번째 카드 숫자 : " + card2);
		System.out.println("카드점수 : " + card_score);
		
		s.close();
	}

}
