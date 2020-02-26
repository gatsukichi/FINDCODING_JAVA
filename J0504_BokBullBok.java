package ssk01;

public class J0504_BokBullBok {
	private char[] items;
	
	private int nextIndex = 0;
	
	public void ready() {
		items = new char[10];
		
		int num = (int)(Math.random() * items.length);
		
		for(int i=0;i<items.length;i++) {
			if(i==num) {
				items[i] = 'X';
			}else {
				items[i] = 'O';
			}
		}
	}
	
	public char selectOne() {
		return items[nextIndex++];
	}
}
