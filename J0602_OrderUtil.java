package ssk01;

public class J0602_OrderUtil {
	//private int count = 0;
	private static int count = 0;
	//static�� ���� ������ ��ü ���� �����˴ϴ�.
	
	public void pressButton() {
		count++;
		System.out.println("������ ��ȣ��" + count + "�Դϴ�.");
	}
	
	public static void main(String[] args) {
		J0602_OrderUtil u1 = new J0602_OrderUtil();
		J0602_OrderUtil u2 = new J0602_OrderUtil();
		u1.pressButton();
		u2.pressButton();
	}
}
