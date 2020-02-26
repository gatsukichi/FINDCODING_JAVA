package ssk01;

public class J0707_TempEmployee extends J0707_Employee {
	private double hireYear;
	
	public J0707_TempEmployee(String empno,String name,int pay,double hireYear) {
		super(empno,name,pay);
		this.hireYear = hireYear;
	}
	
	public double getMonthPay() {
		return (hireYear * pay)/(hireYear * (double)12);
	}
}
