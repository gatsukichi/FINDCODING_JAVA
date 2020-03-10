package ssk01;

import java.util.*;

public class J0809_Time {
	public static void main(String[] args) {
		Calendar time = Calendar.getInstance();
		System.out.println(time.getTime());
		
		time.add(Calendar.SECOND, 120);
		System.out.println(time.getTime());
	}
}
