package ssk01;

public class J0507_WeatherEx {
	public static void main(String[] args) {
		J0507_Weather w1 = new J0507_Weather(2018,7,3,23,29);
		double w1Avg = w1.getAvg();
		System.out.println(w1Avg);
	}
}
