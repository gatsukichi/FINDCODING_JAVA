package ssk01;

public class ZaZangC extends ZaZang {
	public void makeZambong() {
		System.out.println("«���� ����ϴ�.");
	}
	
	public static void main(String[] args) {
		ZaZangC zzc = new ZaZangC();
		
		zzc.makeZambong();
		zzc.makeZaZang();
		
	}
}
