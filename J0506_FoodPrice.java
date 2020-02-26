package ssk01;

public class J0506_FoodPrice {
	private int menuPrice;
	private int quantity;
	
	public J0506_FoodPrice(int menuPrice) {
		this.menuPrice = menuPrice;
		this.quantity = 1;
	}
	
	public J0506_FoodPrice(int menuPrice, int quantity) {
		this.menuPrice = menuPrice;
		this.quantity = quantity;
	}
	
	public int getTotalPrice() {
		return menuPrice * quantity;
	}
}
