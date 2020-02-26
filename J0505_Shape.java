package ssk01;

public class J0505_Shape {
	private char type;
	private int width;
	private int height;
	
	public J0505_Shape(char type, int width, int height) {
		this.type=type;
		this.width=width;
		this.height=height;
	}
	
	public float getArea() {
		float area = 0F;
		
		if(type=='T') {
			area = (width * height)/(float)2;
		}
		return area;
	}
}
