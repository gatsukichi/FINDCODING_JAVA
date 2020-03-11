package ssk01;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class J0911_SimpleClient {
	public static void main(String[] args) throws Exception{
		Socket sk =null;
		InputStream is = null;
		DataInputStream dis = null;
		
		try {
			sk = new Socket("localhost",8111);
			System.out.println("서버 연결 완료");
			
			is = sk.getInputStream();
			dis = new DataInputStream(is);
			
			String msg = dis.readUTF();
			System.out.println("받은 메시지 : " + msg);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(sk != null) {
				try {
					sk.close();
				}catch(Exception e) {
				}
			}
			if(is != null) {
				try {
					is.close();
				}catch(Exception e) {
				}
			}
			if(dis != null) {
				try {
					dis.close();
				}catch(Exception e) {
				}
			}
		}
	}
}