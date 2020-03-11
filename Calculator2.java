package ssk01;

public class Calculator2 {
	public int plus(int a,int b){
		return a+b;
	}
	public int minus(int a,int b){
		return a-b;
	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public double divide(int a,int b) {
		if(b==0) {
			System.out.println("0으로 나눌수없습니다");
			return a;
		}
		
		return (double)a/b;
	}
}
