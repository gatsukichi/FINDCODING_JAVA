package ssk01;

public class J0707_PartTimeEmployee extends J0707_Employee {
	private int workDay;
	
	public J0707_PartTimeEmployee(String empno,String name,int pay, int workDay) {
		super(empno,name,pay);
		this.workDay = workDay;
	}
	
	public double getMonthPay() {
		return (pay/365) * workDay;
	}

}
