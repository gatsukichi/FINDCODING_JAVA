package ssk01;

public class J0801_RentalPay implements J0801_IPayable {
	private float rentalFee = 2000;
	
	public float getMonthFee() {
		return rentalFee;
	}
	
	public float getMonthPay() {
		return getMonthFee();
	}
	
}
