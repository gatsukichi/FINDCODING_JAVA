package ssk01;

import java.net.ServerSocket;
import java.net.Socket;

public class J0909_ServerSocket {
	public static void main(String[] args) throws Exception{
		ServerSocket ssk = null;
		Socket sk = null;
		
		try {
			ssk = new ServerSocket(8111);
			System.out.println("클라이언트 연결 대기 중");
			sk = ssk.accept();
			System.out.println("클라이언트 연결 : " + sk);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(ssk != null) {
				try {
					ssk.close();
				}catch(Exception e) {
					;
				}
			}
			if(sk != null) {
				try {
					sk.close();
				}catch(Exception e) {
					;
				}
			}
		}
	}
}
