package ssk01;

import java.util.*;

public class CalculatorEx {
	public static void main(String[] args) {
		int UserInput1,UserInput2;
		int calcSelection;
		double result;
		Scanner s = new Scanner(System.in);
		Calculator2 calc = new Calculator2();
		
		
		System.out.println("ù��° ���ڸ� �Է��Ͻÿ� : ");
		UserInput1=s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��Ͻÿ� : ");
		UserInput2=s.nextInt();
		System.out.println("��ȣ�Է� (1:���ϱ� 2.���� 3.���ϱ� 4.������) ");
		calcSelection = s.nextInt();
		
		if(calcSelection==1) {
			result=calc.plus(UserInput1, UserInput2);
			System.out.println("���ϱ� ��� : " + (int)result);
		}else if(calcSelection==2){
			result=calc.minus(UserInput1, UserInput2);
			System.out.println("���� ��� : " + (int)result);
		}else if(calcSelection==3){
			result=calc.multiply(UserInput1, UserInput2);
			System.out.println("���ϱ� ��� : " + (int)result);
		}else if(calcSelection==4){
			result=calc.divide(UserInput1, UserInput2);
			System.out.println("������ ��� : " + result);
		}else {
			System.out.println("�߸� �����ϼ̽��ϴ�.");
		}
		
	}
}
