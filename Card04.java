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
				System.out.print("계속 하시겠습니까? y/n : ");
				next_gubun=s.next();
				if(next_gubun.equals("n")) {
					System.out.println("게임 종료");
					break;
				}
			}
			System.out.println("=======================");
			System.out.println(game_round + " 라운드 ");
			System.out.println("=======================");
			
			System.out.print("철수 첫번째 카드 숫자 입력(2~10): ");
			cheolsu_card[0] = s.nextInt();
			cheolsu_card[1] = r.nextInt(9)+2;
			
			computer_card[0]=r.nextInt(9)+2;
			computer_card[1]=r.nextInt(9)+2;
			
			System.out.println("철수카드[" +cheolsu_card[0] + "," + cheolsu_card[1] + "]");
			System.out.println("컴퓨터카드[" +computer_card[0] + "," + computer_card[1] + "]");
			
			System.out.println("카드를 바꿀 수 있습니다.");
			System.out.print("숫자 입력(숫자 번만큼 바꿀수 있음) : ");
			count1 = s.nextInt();
			for(int i=1;i<=count1;i++) {
				cheolsu_card[1] = r.nextInt(9)+2;
				System.out.println("철수카드[" +cheolsu_card[0] + "," + cheolsu_card[1] + "]");
				computer_card[1] = r.nextInt(9)+2;
				System.out.println("컴퓨터카드[" +computer_card[0] + "," + computer_card[1] + "]");
				
				cheolsu_score=(cheolsu_card[0] + cheolsu_card[1])%10;
				computer_score = (computer_card[0] + computer_card[1])%10;
				System.out.println("철수 카드 점수 : " + cheolsu_score);
				System.out.println("컴퓨터 카드 점수 : " + computer_score);
				
				if(i==count1) {
					point=20;
				}else {
					point = 5;
				}
				System.out.println(point + "점 판");
				
				if(cheolsu_score>computer_score) {
					System.out.println("철수가 이겼습니다.");
					cheolsu_point += point;
					computer_point -= point;
				}else if(cheolsu_score<computer_score) {
					System.out.println("컴퓨터가 이겼습니다.");
					cheolsu_point -= point;
					computer_point += point;
				}else {
					System.out.println("비겼습니다.");
				}
				
				System.out.println("철수와 컴퓨터의 현재 점수  ");
				System.out.println("철수 : "+ cheolsu_point);
				System.out.println("컴퓨터 : "+ computer_point);
				System.out.println("-----------------------------------------");
			}
			
		}
		s.close();
	}
}
