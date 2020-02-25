package ssk01;

import java.util.*;

public class J0311_search {
	public static void main(String[] args) {
		int i;
		int id;
		int found=0;
		int[] custID = { 313,453,502,101,892,475,792};
		int[] custCard = {0,50000,75000,0,200000,10000,80000};
		
		Scanner s = new Scanner(System.in);
		System.out.println("고객카드 사용액 검색");
		System.out.print("고객  ID 입력 : ");
		id = s.nextInt();
		
		for(i=0;i<custID.length;i++) {
			if(id==custID[i]) {
				found = 1;
				break;
			}
		}
		
		if(found==1) {
			System.out.println("고객의 카드 사용액: "+ custCard[i]);
		}else {
			System.out.println("잘못된 사용자 ID 입니다.");
		}
		s.close();
	}
}
