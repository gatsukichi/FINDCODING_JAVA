package ssk01;

public class J0601_AccessEx {
	public static void main(String[] args) {
		J0601_Access ac = new J0601_Access();
		ac.setVal2(100);
		int value = ac.getVal2();
		System.out.println(value);
	}
}
