package ssk01;

public class Weather {
	private int year;
	private int month; 
	private int date;
	private double max;
	private double min;
	
	public Weather(int year,int month,int date,double max) {
		this.year = year;
		this.month = month;
		this.date  = date;
		this.max = max;
		this.min = max;
	}
	public Weather(int year,int month,int date,double max,double min) {
		this.year = year;
		this.month = month;
		this.date  = date;
		this.max = max;
		this.min = min;
	}
	
	public double getMax() {
		return this.max;
	}
	
	public double getAvg() {
		return (this.max + this.min) /2;
	}
}
