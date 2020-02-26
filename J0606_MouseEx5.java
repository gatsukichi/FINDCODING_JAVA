package ssk01;

public class J0606_MouseEx5 {
	public static void main(String[] args) {
		J0606_Mouse[] arr = new J0606_Mouse[3];
		arr[0] = new J0606_Mouse();
		arr[1] = new J0606_WheelMouse();
		arr[2] = new J0606_OpticalMouse();
		
		for(int i = 0;i<arr.length;i++) {
			arr[i].clickLeft();
			arr[i].clickRight();
			System.out.println("----------------------------");
		}
	}
}
