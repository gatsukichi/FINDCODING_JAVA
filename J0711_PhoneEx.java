package ssk01;

public class J0711_PhoneEx {
	public static void main(String[] args) {
		J0711_VoiceCall vc = new J0711_Phone();
		vc.getVoiceMsg();
		vc.sendVoiceMsg();
		System.out.println("===========");
		
		J0711_VisualCall vc2 = new J0711_Phone();
		vc2.getVisualMsg();
		vc2.sendVisualMsg();
		System.out.println("========");
		
		J0711_Phone ph= new J0711_Phone();
		ph.getVoiceMsg();
		ph.sendVoiceMsg();
		ph.getVisualMsg();
		ph.sendVisualMsg();
	}
}
