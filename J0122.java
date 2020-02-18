package ssk01;

import java.util.*;

public class J0122 {
	public static void main(String[] args) {
		int input,sum=0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		input=s.nextInt();
		
		while(input>0) {
			if((input%2==0)||(input%3==0)){
				sum+=input;
			}
			input--;
		}
		System.out.print("1부터"+input+"까지 2의배수이거나 3의배수의 총합 : "+sum);
		
		s.close();
	}
}
