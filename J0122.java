package ssk01;

import java.util.*;

public class J0122 {
	public static void main(String[] args) {
		int input,sum=0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		input=s.nextInt();
		
		while(input>0) {
			if((input%2==0)||(input%3==0)){
				sum+=input;
			}
			input--;
		}
		System.out.print("1����"+input+"���� 2�ǹ���̰ų� 3�ǹ���� ���� : "+sum);
		
		s.close();
	}
}
