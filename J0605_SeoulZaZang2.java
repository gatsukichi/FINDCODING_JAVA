package ssk01;

public class J0605_SeoulZaZang2 extends J0605_ZaZang {
	public void makeOldZaZang() {
		super.makeZaZang();
	}
	
	//���� ���̵� : �ڽ� Ŭ�������� �θ� Ŭ������ �޼ҵ� �ٽ� ����
	public void makeZaZang() {
		System.out.println("����� ¥����� ����ϴ�.");
	}
	
	public void makeZamBong() {
		System.out.println("«���� ����ϴ�.");
	}
	
	public static void main(String[] args) {
		J0605_SeoulZaZang2 sz = new J0605_SeoulZaZang2();
		sz.makeOldZaZang();
		sz.makeZaZang();
		sz.makeZamBong();
	}
}
