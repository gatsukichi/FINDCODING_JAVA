package ssk01;

import java.net.ServerSocket;
import java.net.Socket;

public class J0909_ServerSocket {
	public static void main(String[] args) throws Exception{
		ServerSocket ssk = null;
		Socket sk = null;
		
		try {
			ssk = new ServerSocket(8111);
			System.out.println("Ŭ���̾�Ʈ ���� ��� ��");
			sk = ssk.accept();
			System.out.println("Ŭ���̾�Ʈ ���� : " + sk);
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
