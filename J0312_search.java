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
		System.out.println("������ �ִ� ���� ��� ���");
		System.out.println("�ִ� ���� ��� :" + (gameNumber+1) +"��°");
		System.out.println("���� : " + gameScores[gameNumber]);
		System.out.println("���ٿ�� : "+gameRebounds[gameNumber]);
		System.out.println("��ý�Ʈ : "+gameAssists[gameNumber]);
	}
}
