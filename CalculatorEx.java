package ssk01;

import java.util.*;

public class CalculatorEx {
	public static void main(String[] args) {
		int UserInput1,UserInput2;
		int calcSelection;
		double result;
		Scanner s = new Scanner(System.in);
		Calculator2 calc = new Calculator2();
		
		
		System.out.println("첫번째 숫자를 입력하시오 : ");
		UserInput1=s.nextInt();
		System.out.println("두번째 숫자를 입력하시오 : ");
		UserInput2=s.nextInt();
		System.out.println("번호입력 (1:더하기 2.뺴기 3.곱하기 4.나누기) ");
		calcSelection = s.nextInt();
		
		if(calcSelection==1) {
			result=calc.plus(UserInput1, UserInput2);
			System.out.println("더하기 결과 : " + (int)result);
		}else if(calcSelection==2){
			result=calc.minus(UserInput1, UserInput2);
			System.out.println("빼기 결과 : " + (int)result);
		}else if(calcSelection==3){
			result=calc.multiply(UserInput1, UserInput2);
			System.out.println("곱하기 결과 : " + (int)result);
		}else if(calcSelection==4){
			result=calc.divide(UserInput1, UserInput2);
			System.out.println("나누기 결과 : " + result);
		}else {
			System.out.println("잘못 선택하셨습니다.");
		}
		
	}
}
