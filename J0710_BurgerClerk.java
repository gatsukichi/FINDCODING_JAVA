package ssk01;

public class J0710_BurgerClerk {
	private J0710_BurgerCook bc = new J0710_HotelCook();
	
	public void orderBurger() {
		System.out.println("주방에 햄버거를 주문합니다.");
		bc.makeBurger();
	}
	public void orderSalad() {
		System.out.println("주방에 샐러드를 주문합니다.");
		bc.makeSalad();
	}
}
