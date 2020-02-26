package ssk01;

public class J0506_FoodPriceEx {
	public static void main(String[] args) {
		J0506_FoodPrice f1 = new J0506_FoodPrice(5);
		System.out.println(f1.getTotalPrice());
		
		J0506_FoodPrice f2 = new J0506_FoodPrice(5,3);
		System.out.println(f2.getTotalPrice());
	}
}
