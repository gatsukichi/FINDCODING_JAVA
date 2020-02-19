package ssk01;

public class J0208_array {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		int num=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j] = ++num;
				System.out.println(arr[i][j]);
			}
		}
	}
}
