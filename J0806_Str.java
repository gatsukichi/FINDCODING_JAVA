package ssk01;

import java.util.Arrays;

public class J0806_Str {
	public static void main(String[] args) {
		String str1 = "AAA:BBB:CCC:DDD";
		String[] arr = str1.split(":");
		System.out.println(Arrays.toString(arr));
	}
}
