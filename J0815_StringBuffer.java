package ssk01;

public class J0815_StringBuffer {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java ����!!");
		System.out.println("���� ���ڿ� : " + str);
		
		System.out.println(str.insert(4, "Script"));
		System.out.println("insert()�޼ҵ� ȣ�� �� ���� ���ڿ� : "+str);
	}
}
