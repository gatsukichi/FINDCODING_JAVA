package ssk01;

import java.util.*;

public class J0111 {
	public static void main(String[] args) {
		int userInput;
		int randNum;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("���ڸ� �Է��Ͻÿ�(1~5): ");
		userInput = s.nextInt();
		randNum = r.nextInt(5) + 1  ; // 0~5�̸� +1�� ������ ���� 1~6�̸�
		System.out.println("��ǻ�ͼ�:"+randNum);
		
		if(userInput==randNum) {
			System.out.println("��÷");
		}else {
			System.out.println("��");
		}
		
		s.close();
	}
}
