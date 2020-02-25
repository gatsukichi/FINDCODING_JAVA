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
		System.out.println("최우수 영화 후보작 평가");
		for(int i=0; i<5 ; i++) {
			System.out.print(movies[i] + " 평점 입력 : ");
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
		System.out.println("평가 순위");
		for(int m=0;m<5;m++) {
			System.out.println(movies[m] + " 평가 점수 : " + movieRatings[m]);
		}
		s.close();
	}
}
