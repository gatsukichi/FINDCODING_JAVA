package ssk01;

public class J0504_BokBullBokEx {
	public static void main(String[] args) {
		J0504_BokBullBok bok = new J0504_BokBullBok();
		
		bok.ready();
		
		for(int i=0;i<10;i++) {
			char result = bok.selectOne();
			System.out.println(i+"¹øÂ°"+result);
		}
	}
}
