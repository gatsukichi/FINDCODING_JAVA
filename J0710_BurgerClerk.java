package ssk01;

public class J0710_BurgerClerk {
	private J0710_BurgerCook bc = new J0710_HotelCook();
	
	public void orderBurger() {
		System.out.println("�ֹ濡 �ܹ��Ÿ� �ֹ��մϴ�.");
		bc.makeBurger();
	}
	public void orderSalad() {
		System.out.println("�ֹ濡 �����带 �ֹ��մϴ�.");
		bc.makeSalad();
	}
}
