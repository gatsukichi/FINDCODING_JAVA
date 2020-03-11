package ssk01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class J0903_FileInputOutput {
	public static void main(String[] args) throws Exception{
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("C:\\Users\\find102\\eclipse-workspace\\ssk01\\aaa.txt");
			out = new FileOutputStream("bbb.txt");
			
			while(true) {
				int data = in.read();
				if(data ==-1) {
					break;
				}
				out.write(data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();
				}catch(Exception e){
				}
			}
			if(out != null) {
				try {
					out.close();
				}catch(Exception e) {
				}
			}
		}
	}
}