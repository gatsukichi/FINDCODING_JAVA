package ssk01;

public class J1006_Thread {
	public static void main(String[] args) {
		System.out.println("이 프로그램을 실행 합니다.");
		String name = Thread.currentThread().getName();
		System.out.println("실행되고 있는 스레드의 이름 : " + name);
	}
}
