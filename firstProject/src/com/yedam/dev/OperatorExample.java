package com.yedam.dev;

public class OperatorExample {
	public static void main(String[] args) {
		int val1 = 10;
		int result = -3 + (8 - 5)  * 4 + val1++;
		System.out.println(result);
		
		
		//나머지 계산
		result = 10 % 7;
		System.out.println("나머지 : " + result);
		
		
		// 나누기 계산 , 나머지를 무시함
		result = 10 / 7;
		System.out.println("나누기 :" + result);
		
		
		//정수가 아닌 실수 타입을 넣어야 실수 값의 결과가 나옴
		double r1 = 10 / 7.0; 
		System.out.println("나누기2 :" +  r1);
		
		for (int i = 1; i<=10; i++) {
//			System.out.println(i);
			if(i%2 == 1) {
				System.out.println(i + "는 홀수입니다.");
			}else {
				System.out.println(i + "는 짝수입니다.");
			}
		}
	}
}
