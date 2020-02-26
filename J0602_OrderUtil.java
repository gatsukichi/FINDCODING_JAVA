package ssk01;

public class J0602_OrderUtil {
	//private int count = 0;
	private static int count = 0;
	//static이 붙은 변수는 객체 간에 공유됩니다.
	
	public void pressButton() {
		count++;
		System.out.println("고객님의 번호는" + count + "입니다.");
	}
	
	public static void main(String[] args) {
		J0602_OrderUtil u1 = new J0602_OrderUtil();
		J0602_OrderUtil u2 = new J0602_OrderUtil();
		u1.pressButton();
		u2.pressButton();
	}
}
