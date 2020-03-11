package ssk01;

import java.net.URL;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class J0905_Url {
	public static void main(String[] args) throws Exception{
		InputStream in = null;
		OutputStream out = null;
		
		try {
			URL url = new URL("http://www.google.com");
			in = url.openStream();
			out = new FileOutputStream("ddd.txt");
			
			byte[] arr = new byte[10];
			
			while(true) {
				int count = in.read(arr);
				if(count==-1) {
					break;
				}
				out.write(arr,0,count);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();
				}catch(Exception e) {
					;
				}
			}
			if(out != null) {
				try {
					out.close();
				}catch(Exception e) {
					;
				}
			}
		}
	}
}
