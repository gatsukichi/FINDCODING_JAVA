package ssk01;

public class J0603_BlockEx {
	//�� �ѹ��� �����ϰ� �ϴ� static{ }
	static {
		System.out.println("static ��");
	}
	
	public void doa() {
		System.out.println("AAA");
	}
	
	public static void main(String[] args) {
		J0603_BlockEx ex1 = new J0603_BlockEx();
		J0603_BlockEx ex2 = new J0603_BlockEx();
		J0603_BlockEx ex3 = new J0603_BlockEx();
		
		ex1.doa();
		ex2.doa();
		ex3.doa();
	}
}
