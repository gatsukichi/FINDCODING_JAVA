package ssk01;

public class J0709_MP3Ex {
	public static void main(String[] args) {
		J0709_MyMP3 mp3a = new J0709_CompanyAMP3();
		J0709_MyMP3 mp3b = new J0709_CompanyBMP3();
		
		mp3a.playMp3();
		mp3a.listenFM();
		mp3a.viewPhoto();
		
		System.out.println("================");
		
		mp3b.playMp3();
		mp3b.listenFM();
		mp3b.viewPhoto();
	}
}
