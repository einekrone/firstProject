package classes;

public class CalculatorExample {
	public static void main(String[] args) {
//		Calculator cal = new Calculator();
		
		System.out.println("10 + 20 ="  + Calculator.add(10,20));
		System.out.println("10.0 + 20.0 ="  + Calculator.add(10,20));
	
		double r1 = 3.5;
		Calculator.getArea(r1);
	
	
		double r2 = 4;
		double r3 = 5;
		Calculator.getRactagle(r2, r3);
	
		System.out.println("가로 4, 세로 5의 넓이는" + " " + cal.mul(4, 5)+ "입니다.");
	}
}
