package ssk01;

public class J0814_StringBuffer {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java");
		System.out.println("���� ���ڿ� : "+ str);
		
		System.out.println(str.append("����"));
		System.out.println("append() �޼ҵ� ȣ�� �� ���ڿ� : "+str);
	}
}
