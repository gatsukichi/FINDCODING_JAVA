package ssk01;

import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;

public class J0910_SimpleClient {
	public static void main(String[] args) throws Exception{
		Socket sk = null;
		InputStream is = null;
		
		try {
			sk = new Socket("localhost",8111);
			System.out.println("서버 연결 완료");
			is = sk.getInputStream();
			byte[] basket = new byte[10];
			is.read(basket);
			System.out.println(Arrays.toString(basket));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(sk !=null) {
				try {
					sk.close();
				}catch(Exception e) {
					;
				}
			}
			if(is != null) {
				try {
					is.close();
				}catch(Exception e) {
					;
				}
			}
		}
	}
}
