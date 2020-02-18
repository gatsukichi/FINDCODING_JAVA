package ssk01;

import java.util.*;

public class J0111 {
	public static void main(String[] args) {
		int userInput;
		int randNum;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("숫자를 입력하시오(1~5): ");
		userInput = s.nextInt();
		randNum = r.nextInt(5) + 1  ; // 0~5미만 +1된 임의의 정수 1~6미만
		System.out.println("컴퓨터수:"+randNum);
		
		if(userInput==randNum) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		
		s.close();
	}
}
