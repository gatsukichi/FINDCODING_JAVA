package ssk01;

public class J0711_Phone implements J0711_VoiceCall,J0711_VisualCall {
	public void getVoiceMsg() {
		System.out.println("���� �޽��� ���");
	}
	public void sendVoiceMsg() {
		System.out.println("���� �޽��� ������");
	}
	public void getVisualMsg() {
		System.out.println("���� �޽��� ����");
	}
	public void sendVisualMsg() {
		System.out.println("���� �޽��� ������");
	}
}
