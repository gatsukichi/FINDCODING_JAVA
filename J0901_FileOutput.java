package ssk01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class J0901_FileOutput {
	public static void main(String[] args) {
		OutputStream out = null;
		try {
			out = new FileOutputStream("aaa.txt");
			String str = "�ȳ��ϼ��� . \r\n �����մϴ�.";
			byte[] arr = str.getBytes();
			out.write(arr);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(out != null){
				try {
					out.close();
				}catch(Exception e) {
				}
			}
		}
	}
}

