package ssk01;

import java.util.*;

public class J0211_array {
	public static void main(String[] args) {
		int point =100;
		int num;
		String[] contents = {"0","����","����","��ȭ","��ȭ"};
		
		System.out.println("���� ����Ʈ : "+point);
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("0:����,1:����,2:����,3:��ȭ,4:��ȭ");
			System.out.print("�������� �����Ͻðڽ��ϱ�?(��ȣ����):" );
			num = s.nextInt();
			if(num==0) {
				System.out.println("��������");
				break;
			}else {
				if(point <=0) {
					System.out.println("����Ʈ�� �����Ͽ� �������� ������ �������ϴ�.");
					break;
				}else {
					System.out.println(contents[num]+"������ ���� �Ϸ�");
					point = point-25;
					System.out.println("��������Ʈ:"+point);
				}
			}
		}
		s.close();
	}
}
