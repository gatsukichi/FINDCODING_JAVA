package ssk01;

import java.util.*;

public class J0604_AreaUI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		double r = s.nextDouble();
		double area  = J0604_Area.calcCircle(r);
		
		
		
		System.out.println("���̴�:"+area);
		s.close();
	}
}
