package ssk01;

public class J0707_RegularEmployee extends J0707_Employee{
	private int bonus;
	
	public J0707_RegularEmployee(String empno,String name,int pay,int bonus) {
		super(empno,name,pay);
		this.bonus = bonus;
	}
	
	public double getMonthPay() {
		return (pay/(double)12 + (bonus/(double)12));
	}
}
