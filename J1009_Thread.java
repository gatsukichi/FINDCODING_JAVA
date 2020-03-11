package ssk01;

public class J1009_Thread extends Thread{
	private String name;
	private int pos;
	
	public J1009_Thread(String name) {
		this.name = name;
	}
	
	public void run() {
		race();
	}
	
	public void race() {
		for(int i = 0; i<100;i++) {
			pos = pos + (int)(Math.random()*100);
			System.out.println("Horse: "+name+ " : " + pos);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		J1009_Thread h1 = new J1009_Thread("1번 말");
		J1009_Thread h2 = new J1009_Thread("2번 말");
		J1009_Thread h3 = new J1009_Thread("3번 말");
		h1.start();
		h2.start();
		h3.start();
	}
}
