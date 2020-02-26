package ssk01;

public class J0507_Weather {
	private int year;
	private int month;
	private int date;
	private double min;
	private double max;
	
	public J0507_Weather(int year,int month,int date,double min,double max) {
		this.year = year;
		this.month = month;
		this.date = date;
		this.min = min;
		this.max = max;
	}
	
	public double getAvg() {
		return (min+max)/2;
	}
}
