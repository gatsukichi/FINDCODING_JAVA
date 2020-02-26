package ssk01;

public class J0606_MouseEx3 {
	public void mouseClick(J0606_Mouse m) {
		m.clickLeft();
		m.clickRight();
	}
	
	public static void main(String[] args) {
		J0606_MouseEx3 me3 = new J0606_MouseEx3();
		J0606_Mouse m = new J0606_Mouse();
		me3.mouseClick(m);
	}
}
