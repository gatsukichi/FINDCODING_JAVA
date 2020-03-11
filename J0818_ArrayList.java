package ssk01;

import java.util.ArrayList;

public class J0818_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(40);
		arrList.add(20);
		arrList.add(30);
		arrList.add(10);
		
		for(int i=0; i<arrList.size();i++) {
			System.out.print(arrList.get(i)+" ");
		}
		System.out.println();
		
		arrList.remove(1);
		
		for(int i=0; i<arrList.size();i++) {
			System.out.print(arrList.get(i)+" ");
		}
		System.out.println();
		
	}
}
