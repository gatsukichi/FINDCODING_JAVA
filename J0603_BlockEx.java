package ssk01;

public class J0603_BlockEx {
	//단 한번만 동작하게 하는 static{ }
	static {
		System.out.println("static 블럭");
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
