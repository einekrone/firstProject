package com.yedam.oper;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if( (charCode>=65) || (charCode<=999)) { // 
			System.out.println("대문자 이군요");
		}
	
		
		int num1 = 10;
		int num2 = 20;
		if(num1++ < 10 && num2++ >20 ) {
			System.out.println("참입니다"); // num2 는 num1이 이미 false기 때문에 뒤에 증감연산을 적용하지 않음.
		}
		System.out.println(num1+ "," + num2);
	
	
		int a = 10, b = 11;
		int result = a | b;
		System.out.println("논리곱결과:" + result);
		
		result = a << 2; 
		System.out.println("비트이동결과:" + result);
		
		result = 30 <<3;
		System.out.println("비트이동결과:" + result);
		
		result += 30; // result = result+30;
		System.out.println(result);

		result = 80;
		boolean pass = false;
		if(result >= 80) {
			pass = true;
		} else {
			pass = false;
		}		
		pass = (result >= 80) ? true : false;
		System.out.println(pass);
	}
}
