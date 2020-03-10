package ssk01;

public class J0801_PartTimer implements J0801_IPayable {
	private int days = 30;
	private float pay = 100;
	
	public float getMonthPay() {
		return days * pay;
	}
}
