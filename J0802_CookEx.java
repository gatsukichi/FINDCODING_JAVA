package ssk01;

public class J0802_CookEx {
	public static void main(String[] args) {
		//���1
		//J0802_CookManager cm = new J0802_CookManager();
		
		//���2
		//J0802_KoreanCook kc = new J0802_KoreanCook();
		//J0802_CookManager cm = new J0802_CookManager(kc);
		
		//���3
		J0802_KoreanCook kc = new J0802_KoreanCook();
		J0802_CookManager cm = new J0802_CookManager();
		cm.setCook(kc);
		
		cm.orderRice();
		cm.orderSoup();
		cm.orderSalad();
		cm.orderSource();
	}
}
