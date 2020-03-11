package ssk01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class J1001_EchoClient {
	public static void main(String[] args) throws Exception{
		Socket sk = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		InputStream is = null;
		DataInputStream dis = null;
		Scanner s = null;
		
		try {
			sk = new Socket("localhost",8112);
			System.out.println("서버 연결 완료");
			
			os = sk.getOutputStream();
			dos = new DataOutputStream(os);
			
			is = sk.getInputStream();
			dis = new DataInputStream(is);
			
			s = new Scanner(System.in);
			
			while(true) {
				System.out.print("서버로 전송할 메시지를 입력해 주세요 : ");
				String msg = s.nextLine();
				dos.writeUTF(msg);
				dos.flush();
				
				if(msg.equals("exit")){
					System.out.println("접속종료");
					break;
				}
				
				String readMsg = dis.readUTF();
				System.out.println("받은메시지 : "+ readMsg);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(sk != null) {
				try {
					sk.close();
				}catch(Exception e){
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
			if(s != null) {
				try {
					s.close();
				}catch(Exception e) {
				}
			}
		}
	}
}