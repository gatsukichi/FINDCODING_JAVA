package ssk01;

public class J0606_MouseEx4 {
	public void mouseClick(J0606_OpticalMouse om) {
		om.clickLeft();
		om.clickRight();
	}
	
	public static void main(String[] args) {
		J0606_MouseEx4 me4 = new J0606_MouseEx4();
		J0606_OpticalMouse om = new J0606_OpticalMouse();
		me4.mouseClick(om);
	}
}
