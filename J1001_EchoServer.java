package ssk01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class J1001_EchoServer {
	public static void main(String[] args) throws Exception{
		ServerSocket ssk = null;
		Socket sk = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			ssk = new ServerSocket(8112);
			System.out.println("���� �غ� �Ϸ�");
			
			sk = ssk.accept();
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
			
			is = sk.getInputStream();
			dis = new DataInputStream(is);
			
			os = sk.getOutputStream();
			dos = new DataOutputStream(os);
			
			while(true) {
				String userMsg = dis.readUTF();
				System.out.println("����� �޽��� :" + userMsg);
				if(userMsg.equals("exit")) {
					System.out.println("��������");
					break;
				}
				dos.writeUTF(userMsg);
				dos.flush();
			}
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