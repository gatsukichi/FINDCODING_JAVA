package ssk01;

public class J0606_MouseEx {
	public static void main(String[] args) {
		J0606_Mouse m = new J0606_Mouse();
		m.clickLeft();
		m.clickRight();
		
		System.out.println("=================================");
		
		J0606_WheelMouse wm = new J0606_WheelMouse();
		wm.clickLeft();
		wm.clickRight();
		wm.scroll();
	}
}
