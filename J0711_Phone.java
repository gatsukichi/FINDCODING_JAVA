package ssk01;

public class J0711_Phone implements J0711_VoiceCall,J0711_VisualCall {
	public void getVoiceMsg() {
		System.out.println("음성 메시지 듣기");
	}
	public void sendVoiceMsg() {
		System.out.println("음성 메시지 보내기");
	}
	public void getVisualMsg() {
		System.out.println("영상 메시지 보기");
	}
	public void sendVisualMsg() {
		System.out.println("음성 메시지 보내기");
	}
}
