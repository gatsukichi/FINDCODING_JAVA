package ssk01;

public class J0503_PigSaveEx {
	public static void main(String[] args) {
		J0503_PigSave save = new J0503_PigSave();
		save.deposit(100);
		save.deposit(500);
		save.deposit(100);
		int totalMoney = save.getTotal();
		System.out.println("รัพื : " + totalMoney);
	}
}
