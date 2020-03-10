package ssk01;

import java.util.Timer;
import java.util.TimerTask;

public class J0808_MyTimer {
	public static void main(String[] args) throws InterruptedException{
		Timer t = new Timer(true);
		
		TimerTask task1 = new J0808_MyTimeTask();
		System.out.println("task1은 잠시후에 실행됩니다.");
		
		TimerTask task2 = new J0808_YourTimeTask();
		System.out.println("task2은 5초 후에 실행됩니다.");
		
		t.schedule(task1, 2000);
		t.schedule(task2, 5000);
		Thread.sleep(7000);
		System.out.println("작업종료");
	}
}
