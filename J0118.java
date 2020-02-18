package ssk01;

import java.util.*;

public class J0118 {
	public static void main(String[] args) {
		int userNum;
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하시오(1~9): ");
		userNum = s.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println(userNum+"X"+i+"="+(userNum*i));
		}
		
		s.close();
	}
}
