package ssk01;

public class J0710_BurgerEx {
	public static void main(String[] args) {
		J0710_BurgerCook bc= new J0710_HotelCook();
		J0710_BurgerCook bc2= new J0710_InstantCook();
		
		bc.makeBurger();
		bc.makeSalad();
		
		System.out.println("==================");
		
		bc2.makeBurger();
		bc2.makeSalad();
		
		System.out.println("==================");
		
		J0710_BurgerClerk bc3 = new J0710_BurgerClerk();
		bc3.orderBurger();
		bc3.orderSalad();
	}
}
