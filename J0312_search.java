package ssk01;

public class J0312_search {
	public static void main(String[] args) {
		int[] gameScores = { 12,5,21,15,32,10,6};
		int[] gameRebounds = { 5,7,1,4,10,3,2};
		int[] gameAssists = {2,9,4,3,6,1,11};
		int bestGameScores = 0;
		int gameNumber = 0;
		
		for(int i=0;i<7;i++) {
			if(gameScores[i]>bestGameScores) {
				bestGameScores = gameScores[i];
				gameNumber=i;
			}
		}
		System.out.println("선수의 최다 득점 경기 기록");
		System.out.println("최다 득점 경기 :" + (gameNumber+1) +"번째");
		System.out.println("득점 : " + gameScores[gameNumber]);
		System.out.println("리바운드 : "+gameRebounds[gameNumber]);
		System.out.println("어시스트 : "+gameAssists[gameNumber]);
	}
}
