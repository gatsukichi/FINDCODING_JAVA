package ssk01;

public class J0816_StringBuffer {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java Oracle");
		System.out.println("���� ���ڿ� : "+str);
		
		System.out.println(str.delete(4, 8));
		System.out.println(str.deleteCharAt(1));
		System.out.println("deleteCharAt()�޼ҵ� ȣ�� �� ���� ���ڿ� : "+str);
		
	}
}
