package classes;

public class Calculator {
	double pi = 3.14;
	
	// 가로, 세로 => 넓이를 반환해주는 메소드 (getReactagle)
	
	public int add(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum;
	}
	public double add(double x, double y) {
		return x + y;
	}
	
	public void getArea(double a) {
		double result = pi * a * a;
		System.out.println("반지름 " + a + "넓이는 " +  result);
	}
	public void getRactagle(double c, double d) {
		double result = c * d;
		System.out.println("가로" +  c + ","+ "세로" +  d +"의 넓이는 " +  result);
	}
	
	public double mul(double a, double b) {
		return (a * b);
	}
	
}
