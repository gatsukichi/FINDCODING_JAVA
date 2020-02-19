package ssk01;

import java.util.*;

public class J0210 {
	public static void main(String[] args) {
		String[] com = {"가위","바위","보"};
		String user;
		String end;
		int comNum;
		
		Scanner s = new Scanner(System.in);
		Random r= new Random();
		
		do{
			System.out.print("입력하시오(가위/바위/보): ");
			user = s.nextLine();
			comNum = r.nextInt(3); //0~2 까지
			System.out.println("컴퓨터 : " + com[comNum]);
			
			if(user.equals(com[comNum])) {
				System.out.println("비겼습니다.");
			}else if(user.equals("가위") && com[comNum].equals("보")) {
				System.out.println("이겼습니다.");
			}else if(user.equals("바위") && com[comNum].equals("가위")) {
				System.out.println("이겼습니다.");
			}else if(user.equals("보") && com[comNum].equals("바위")) {
				System.out.println("이겼습니다.");
			}else {
				System.out.println("졌습니다.");
			}
			
			System.out.print("게임을종료하시겠습니까? Y/N : ");
			end = s.nextLine();
			
		}while(!end.equals("Y"));
		
		s.close();
	}
}
