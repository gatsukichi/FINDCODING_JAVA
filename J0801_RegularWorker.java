package ssk01;

public class J0801_RegularWorker implements J0801_IPayable {
	private float yearSalary = 100000;
	
	public float getMonthSal() {
		return yearSalary/12;
	}
	
	public float getMonthPay() {
		return getMonthSal();
	}

}
