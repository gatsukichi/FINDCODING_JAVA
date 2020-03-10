package ssk01;

public class J0807_Str {
	public static void main(String[] args) {
		String str1 = "BBB";
		String str2 = "   BBB";
		boolean result = str1.equals(str2);
		System.out.println(result);
		boolean result2 = str1.equals(str2.trim());
		System.out.println(result2);
	}
}
