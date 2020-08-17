package classes;

public class CalExample {
	public static void main(String[] args) {
		Cal cal = new Cal();
//		cal.r = -5;
		cal.setRadius(4);
		System.out.println("반지름: "+ cal.getRadius() +" 의 넓이는:" + cal.getArea());
		
		// println 은 각각의 데이터 타입에 정의가 되어있어서 출력이 가능함.
//		System.out.println(10);
//		System.out.println(10.5);
//		System.out.println("10");
//		
		print(200.5);
	}
	//메소드 오버로딩
	// 동일한 메소드명을 사용 : 매개값의, 타입이 다르거나 갯수가가 다를때
	public static void print(int a) {
		System.out.println("입력값은 :" + a+" 입니다");
	
	}
	public static void print(double a) {
		System.out.println("입력값은 :" + a +" 입니다");
	}
	public static void print(String a) {
		System.out.println("입력값은 :" + a+" 입니다");
	}
}
