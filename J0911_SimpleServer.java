package ssk01;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class J0911_SimpleServer {
	public static void main(String[] args) throws Exception{
		String str1 = "안녕하세요. 감사합니다.";
		ServerSocket ssk = null;
		Socket sk = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			ssk = new ServerSocket(8111);
			System.out.println("서버준비 완료");
			sk = ssk.accept();
			System.out.println("클라이언트 연결 완료");
			
			os = sk.getOutputStream();
			dos = new DataOutputStream(os);
			dos.writeUTF(str1);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(ssk != null) {
				try {
					ssk.close();
				}catch(Exception e){
				}
		    }
			if(sk != null) {
				try {
					sk.close();
				}catch(Exception e) {
				}
			}
			if(os != null) {
				try {
					os.close();
				}catch(Exception e) {
				}
			}
			if(dos != null) {
				try {
					dos.close();
				}catch(Exception e) {
				}
			}
		}
	}
}