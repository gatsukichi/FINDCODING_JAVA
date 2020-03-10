package ssk01;

public class J0802_CookManager {
	//방법1
	//private J0802_ICook ic = new J0802_KoreanCook();
	
	//방법2
	//private J0802_ICook ic;
	//public J0802_CookManager(J0802_ICook ic){
		//this.ic = ic;
	//}
	
	//방법3
	private J0802_ICook ic;
	public void setCook(J0802_ICook ic) {
		this.ic = ic;
	}
	
	public void orderRice() {
		System.out.println("주문을 받습니다.");
		ic.makeRice();
	}
	
	public void orderSoup() {
		System.out.println("주문을 받습니다.");
		ic.makeSoup();
	}
	
	public void orderSalad() {
		System.out.println("주문을 받습니다.");
		ic.makeSalad();
	}
	
	public void orderSource() {
		System.out.println("주문을 받습니다.");
		ic.makeSource();
	}
}
