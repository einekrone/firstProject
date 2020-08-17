package classes;

public class Calculator {
	private static double pi = 3.14; //static 이 없으면 new 인스턴스를 만들어야함
	
	// 가로, 세로 => 넓이를 반환해주는 메소드 (getReactagle)
	
	public static int add(int x, int y) { // 필드는 private 로 숨기고 메소드는 public로 공개함
		int sum = 0;
		sum = x + y;
		return sum;
	}
	public static double add(double x, double y) {
		return x + y;
	}
	
	public static void getArea(double a) {
		double result = pi * a * a;
		System.out.println("반지름 " + a + "넓이는 " +  result);
	}
	public static void getRactagle(double c, double d) {
		double result = c * d;
		System.out.println("가로" +  c + ","+ "세로" +  d +"의 넓이는 " +  result);
	}
	
	public static double mul(double a, double b) {
		return (a * b);
	}
	
}
