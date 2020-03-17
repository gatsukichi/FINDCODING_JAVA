package ssk01;

public class MyMP3Ex {
	public static void main(String[] args) {
		CompanyAMP3 am = new CompanyAMP3();
		CompanyBMP3 bm = new CompanyBMP3();
		
		am.playMp3();
		am.listenFM();
		am.viewPhoto();
		System.out.println("====================");
		bm.playMp3();
		bm.listenFM();
		bm.viewPhoto();
		
	}
}
