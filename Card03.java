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
			System.out.print("철수 첫번째 카드 숫자 입력(2~10):");
			cheolsu_card1=s.nextInt();
			cheolsu_card2=r.nextInt(9)+2;
			System.out.println("철수 두번째 카드 : " + cheolsu_card2);
			cheolsu_score=(cheolsu_card1+cheolsu_card2)%10;
			
			computer_card1 = r.nextInt(9)+2;
			computer_card2 = r.nextInt(9)+2;
			System.out.println("컴퓨터 첫번째 카드:"+computer_card1);
			System.out.println("컴퓨터 두번째 카드:"+computer_card2);
			computer_score=(computer_card1+computer_card2)%10;
			
			System.out.println("철수 카드 점수 : " +cheolsu_score);
			System.out.println("컴퓨터 카드 점수: "+ computer_score);
			
			if(cheolsu_score>computer_score) {
				System.out.println("철수가 이겼습니다.");
				cheolsu_point = cheolsu_point+20;
				computer_point = computer_point-20;
			}else if(cheolsu_score<computer_score) {
				System.out.println("컴퓨터가 이겼습니다.");
				computer_point=computer_point+20;
				cheolsu_point=cheolsu_point-20;
			}else {
				System.out.println("비겼습니다.");
			}
			
			System.out.println("철수와 컴퓨터의 현재 점수");
			System.out.println("철수: "+cheolsu_point);
			System.out.println("컴퓨터 : "+computer_point);
			
			if(cheolsu_point<0) {
				System.out.println("철수의 점수가 0점보다 작아서 게임종료");
				break;
			}else if(computer_point<0) {
				System.out.println("컴퓨터의 점수가 0 점보다 작아서 게임 종료");
				break;
			}else {
				System.out.println("게임 계속");
			}
			
		}
		s.close();
	}
}
