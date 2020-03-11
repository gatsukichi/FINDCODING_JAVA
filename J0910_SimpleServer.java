package ssk01;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class J0910_SimpleServer {
	public static void main(String[] args) throws Exception{
		ServerSocket ssk = null;
		Socket sk = null;
		OutputStream os = null;
		
		
		try {
			ssk = new ServerSocket(8111);
			System.out.println("서버 준비 완료");
			sk = ssk.accept();
			System.out.println("클라이언트 연결 완료");
			byte[] arr = {1,2,3,4,5,6,7,8,9,10};
			os = sk.getOutputStream();
			os.write(arr);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(ssk !=null) {
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
			if(os != null) {
				try {
					os.close();
				}catch(Exception e){
					;
				}
			}
		}
	}
}
