package ssk01;

public class J0605_SeoulZaZang extends J0605_ZaZang {
	public void makeZambong() {
		System.out.println("«���� ����ϴ�.");
	}
	
	public static void main(String[] args) {
		J0605_SeoulZaZang sz = new J0605_SeoulZaZang();
		sz.makeZaZang();
		sz.makeZambong();
	}
}
