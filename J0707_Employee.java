//�߻�Ŭ����: ��ü�� �ƴ϶� Ÿ�����θ� �����ϰ� �߻� �޼ҵ带 ������ ����
//            ��ü ������ �ȵǰ� �θ�Ŭ�����θ� �����ϴ� Ŭ����
//            Ŭ���� ���� �տ� abstract��� Ű���带 ����

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
	
	//�߻� �޼ҵ�  : �������� �ݵ�� �������̵� �϶�� �������� ������ �޼ҵ�
	
	public abstract double getMonthPay();
	
	public String toString() {
		return empno + ":"+name+":"+":"+pay;
	}

}
