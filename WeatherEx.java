package ssk01;

public class WeatherEx {
	public static void main(String[] args) {
		Weather w1 = new Weather(2020,3,17,20);
		Weather w2 = new Weather(2020,3,17,20,10);
		
		System.out.println(w1.getAvg()+"µµ");
		System.out.println(w2.getAvg()+"µµ");
	}
}
