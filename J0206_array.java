package ssk01;

import java.util.*;

public class J0206_array {
	public static void main(String[] args) {
		int a;
		int[] arr = {11,30,55,76,90};
		
		Random r = new Random();
		a = r.nextInt(5);
		
		System.out.println(arr[a]);
	}
}

