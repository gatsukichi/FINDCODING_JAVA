package ssk01;

public class J0802_CookManager {
	//���1
	//private J0802_ICook ic = new J0802_KoreanCook();
	
	//���2
	//private J0802_ICook ic;
	//public J0802_CookManager(J0802_ICook ic){
		//this.ic = ic;
	//}
	
	//���3
	private J0802_ICook ic;
	public void setCook(J0802_ICook ic) {
		this.ic = ic;
	}
	
	public void orderRice() {
		System.out.println("�ֹ��� �޽��ϴ�.");
		ic.makeRice();
	}
	
	public void orderSoup() {
		System.out.println("�ֹ��� �޽��ϴ�.");
		ic.makeSoup();
	}
	
	public void orderSalad() {
		System.out.println("�ֹ��� �޽��ϴ�.");
		ic.makeSalad();
	}
	
	public void orderSource() {
		System.out.println("�ֹ��� �޽��ϴ�.");
		ic.makeSource();
	}
}
