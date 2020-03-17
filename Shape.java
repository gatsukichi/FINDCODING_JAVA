package ssk01;

public class Shape {
	private char type;
	private int width;
	private int height;
	
	public Shape(char type,int width,int height) {
		this.type=type;
		this.width=width;
		this.height=height;
	}
	
	public float getArea() {
		if(type=='T') {
			return (float)width*height/2;
		}else if(type=='S') {
			return (float)width*height;
		}else {
			System.out.println("type을 알수 없습니다.");
			return 0;
		}
	}
}
