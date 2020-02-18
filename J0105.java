package ssk01;

import java.util.*;

public class J0105 {
	public static void main(String[] args) {
		
		double a;
		Scanner s = new Scanner(System.in); 
		
		System.out.print("반지름을 입력하시오 : ");
		a = s.nextInt();
		
		System.out.println("원의 넓이는 "+ ((a*a)*3.14) +"입니다.");
		
		s.close();
		
	}
}
