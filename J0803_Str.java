package ssk01;

public class J0803_Str {
	public static void main(String[] args) {
		String str1 = "ABCDE";
		
		int len = str1.length();
		
		for(int i=0;i<len;i++) {
			System.out.println(str1.charAt(i));
		}
		
		int idx1 = str1.indexOf("D");
		System.out.println(idx1);
	}
}
