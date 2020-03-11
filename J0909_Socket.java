package ssk01;

import java.net.Socket;

public class J0909_Socket {
	public static void main(String[] args) {
		Socket sk = null;
		
		try {
			sk = new Socket("localhost",8111);
			System.out.println("연결 되었습니다." + sk);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
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
