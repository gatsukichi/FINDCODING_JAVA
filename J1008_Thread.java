package ssk01;

public class J1008_Thread implements Runnable {
	public void run() {
		try {
			doJob();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void doJob() throws Exception{
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i;
			Thread.sleep(100);
			System.out.println(sum);
		}
	}
	
	public static void main(String[] args) throws Exception{
		J1008_Thread th = new J1008_Thread();
		Thread t0 = new Thread(th);
		Thread t1 = new Thread(th);
		Thread t2 = new Thread(th);
		t0.start();
		t1.start();
		t2.start();
		System.out.println("====================");
	}
	
}
