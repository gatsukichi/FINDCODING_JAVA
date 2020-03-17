package ssk01;

public class PigSave2 {
	private int total=0;
	
	public int getTotal(){
		return total;
	}
	public void deposit(int amount) {
		total+=amount;
	}
}
