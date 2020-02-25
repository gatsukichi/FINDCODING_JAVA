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
		
		System.out.print("철수 첫번째 카드 숫자 입력(2~10): ");
		cheolsu_card1=s.nextInt();
		cheolsu_card2=r.nextInt(9)+2;
		System.out.println("철수 두번째 카드 : " +cheolsu_card2);
		cheolsu_score = (cheolsu_card1 + cheolsu_card2)%10;
		
		System.out.print("민수 첫번째 카드 숫자 입력(2~10): ");
		minsu_card1=s.nextInt();
		minsu_card2=r.nextInt(9)+2;
		System.out.println("민수 두번째 카드 : " +minsu_card2);
		minsu_score = (minsu_card1 + minsu_card2)%10;
		
		System.out.println("철수 카드 점수 : " + cheolsu_score);
		System.out.println("민수 카드 점수 : " + minsu_score);
		
		if(cheolsu_score>minsu_score) {
			System.out.println("철수가 이겼습니다.");
		}else if(cheolsu_score<minsu_score) {
			System.out.println("민수가 이겼습니다.");
		}else {
			System.out.println("비겼습니다.");
		}
		s.close();
	}
}
