package ssk01;

import java.net.Socket;

public class J0909_Socket {
	public static void main(String[] args) {
		Socket sk = null;
		
		try {
			sk = new Socket("localhost",8111);
			System.out.println("���� �Ǿ����ϴ�." + sk);
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
