//추상클래스: 객체가 아니라 타입으로만 존재하고 추상 메소드를 가지는 존재
//            객체 생성은 안되고 부모클래스로만 존재하는 클래스
//            클래스 선언 앞에 abstract라는 키워드를 붙임

package ssk01;

public abstract class J0707_Employee {
	protected String empno;
	protected String name;
	protected int pay;
	
	public J0707_Employee(String empno,String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	//추상 메소드  : 하위에서 반드시 오버라이드 하라는 강제성을 가지는 메소드
	
	public abstract double getMonthPay();
	
	public String toString() {
		return empno + ":"+name+":"+":"+pay;
	}

}
