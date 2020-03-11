package ssk01;

public class J1007_Thread {
	public void doJob() throws Exception{
		int sum = 0;
		for(int i = 1;i<=100;i++) {
			sum += i;
			Thread.sleep(100);
			System.out.println(sum);
		}
	}
	
	public static void main(String[] args) throws Exception{
		J1007_Thread th = new J1007_Thread();
		th.doJob();
	}
}
