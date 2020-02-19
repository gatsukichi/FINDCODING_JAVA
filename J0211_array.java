package ssk01;

import java.util.*;

public class J0211_array {
	public static void main(String[] args) {
		int point =100;
		int num;
		String[] contents = {"0","음악","게임","만화","영화"};
		
		System.out.println("최초 포인트 : "+point);
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("0:종료,1:음악,2:게임,3:만화,4:영화");
			System.out.print("콘텐츠를 구매하시겠습니까?(번호선택):" );
			num = s.nextInt();
			if(num==0) {
				System.out.println("구매종료");
				break;
			}else {
				if(point <=0) {
					System.out.println("포인트가 부족하여 콘텐츠를 구매할 수없습니다.");
					break;
				}else {
					System.out.println(contents[num]+"콘텐츠 구매 완료");
					point = point-25;
					System.out.println("현재포인트:"+point);
				}
			}
		}
		s.close();
	}
}
