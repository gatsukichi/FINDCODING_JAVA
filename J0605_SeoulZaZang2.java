package ssk01;

public class J0605_SeoulZaZang2 extends J0605_ZaZang {
	public void makeOldZaZang() {
		super.makeZaZang();
	}
	
	//오버 라이딩 : 자식 클래스에서 부모 클래스의 메소드 다시 정의
	public void makeZaZang() {
		System.out.println("현대식 짜장면을 만듭니다.");
	}
	
	public void makeZamBong() {
		System.out.println("짬뽕을 만듭니다.");
	}
	
	public static void main(String[] args) {
		J0605_SeoulZaZang2 sz = new J0605_SeoulZaZang2();
		sz.makeOldZaZang();
		sz.makeZaZang();
		sz.makeZamBong();
	}
}
