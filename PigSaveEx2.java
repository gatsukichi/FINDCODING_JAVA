package ssk01;

import java.util.*;

public class PigSaveEx2 {
	public static void main(String[] args) {
		PigSave2 PS = new PigSave2();
		Scanner s = new Scanner(System.in);
		int userInput,selection;
		
		while(true) {
			System.out.print("업무를 선택하시오(1:입금,2:잔액확인,3:종료) : ");
			selection = s.nextInt();
			if(selection==1){
				System.out.print("입금할 금액을 입력하시오 : ");
				userInput=s.nextInt();
				PS.deposit(userInput);
				System.out.println("입금 완료");
			}else if(selection==2) {
				System.out.println("현재 잔액 : " + PS.getTotal());
			}else if(selection==3) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
		
		System.out.println("은행업무 종료");
		s.close();
	}
}
