package ssk01;

import java.util.*;

public class J0210 {
	public static void main(String[] args) {
		String[] com = {"����","����","��"};
		String user;
		String end;
		int comNum;
		
		Scanner s = new Scanner(System.in);
		Random r= new Random();
		
		do{
			System.out.print("�Է��Ͻÿ�(����/����/��): ");
			user = s.nextLine();
			comNum = r.nextInt(3); //0~2 ����
			System.out.println("��ǻ�� : " + com[comNum]);
			
			if(user.equals(com[comNum])) {
				System.out.println("�����ϴ�.");
			}else if(user.equals("����") && com[comNum].equals("��")) {
				System.out.println("�̰���ϴ�.");
			}else if(user.equals("����") && com[comNum].equals("����")) {
				System.out.println("�̰���ϴ�.");
			}else if(user.equals("��") && com[comNum].equals("����")) {
				System.out.println("�̰���ϴ�.");
			}else {
				System.out.println("�����ϴ�.");
			}
			
			System.out.print("�����������Ͻðڽ��ϱ�? Y/N : ");
			end = s.nextLine();
			
		}while(!end.equals("Y"));
		
		s.close();
	}
}
