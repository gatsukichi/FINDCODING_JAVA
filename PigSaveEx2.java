package ssk01;

import java.util.*;

public class PigSaveEx2 {
	public static void main(String[] args) {
		PigSave2 PS = new PigSave2();
		Scanner s = new Scanner(System.in);
		int userInput,selection;
		
		while(true) {
			System.out.print("������ �����Ͻÿ�(1:�Ա�,2:�ܾ�Ȯ��,3:����) : ");
			selection = s.nextInt();
			if(selection==1){
				System.out.print("�Ա��� �ݾ��� �Է��Ͻÿ� : ");
				userInput=s.nextInt();
				PS.deposit(userInput);
				System.out.println("�Ա� �Ϸ�");
			}else if(selection==2) {
				System.out.println("���� �ܾ� : " + PS.getTotal());
			}else if(selection==3) {
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}
		
		
		System.out.println("������� ����");
		s.close();
	}
}
