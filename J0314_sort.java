package ssk01;

import java.util.*;


public class J0314_sort {
	public static void main(String[] args) {
		String[] movies = {"Romeo and Juliet","Life Is Beautiful",
							"Avengers","Spider Man","Titanic"};
		String tempMovies = "for change";
		int[] movieRatings = new int[5];
		int tempMovieRatings;
		int didSwap;
		
		Scanner s= new Scanner(System.in);
		System.out.println("�ֿ�� ��ȭ �ĺ��� ��");
		for(int i=0; i<5 ; i++) {
			System.out.print(movies[i] + " ���� �Է� : ");
			movieRatings[i] = s.nextInt();
		}
		
		for(int i =0;i<5; i++) {
			didSwap = 0;
			for(int j=0; j<4; j++) {
				if(movieRatings[j] < movieRatings[j+1]) {
					tempMovies = movies[j+1];
					movies[j+1] = movies[j];
					movies[j] = tempMovies;
					
					tempMovieRatings = movieRatings[j+1];
					movieRatings[j+1] = movieRatings[j];
					movieRatings[j] = tempMovieRatings;
					didSwap=1;
				}
			}
			if(didSwap==0) {
				break;
			}
		}
		System.out.println("�� ����");
		for(int m=0;m<5;m++) {
			System.out.println(movies[m] + " �� ���� : " + movieRatings[m]);
		}
		s.close();
	}
}
