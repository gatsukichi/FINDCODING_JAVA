package ssk01;

import java.util.*;

public class J0604_AreaUI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		double r = s.nextDouble();
		double area  = J0604_Area.calcCircle(r);
		
		
		
		System.out.println("넓이는:"+area);
		s.close();
	}
}
