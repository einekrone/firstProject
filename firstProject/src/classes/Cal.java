package classes;

public class Cal {
	private int r; // 반지름 // 필드는 항상 private 로 선언
	private double pi = 3.14; // 필드를 숨기고 메소드를 통해서 필드의 값을 지정하거나 가져올 수 있도록함.
	
	public void setRadius(int r) {
		if(r<0)
			r = 0;
		else // else 문이 빠지면 안됨
			this.r = r;
	}
	public int getRadius() {
		return r;
	}
	
	public double getArea() {
		double result = pi * r * r;
		return result;
	}
}
