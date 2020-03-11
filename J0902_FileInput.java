package ssk01;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class J0902_FileInput {
	public static void main(String[] args) throws Exception{
		InputStream in = new FileInputStream("C:\\Users\\find102\\eclipse-workspace\\ssk01\\aaa.txt");
		Scanner s = new Scanner(in);
		
		while(true){
			try {
				String str1 = s.nextLine();
				System.out.println(str1);
			}catch(Exception e) {
				break;
			}finally {
				if(in !=null) {
					try {
						in.close();
					}catch(Exception e) {
					}
				}
			}
		}
		s.close();
	}
}
