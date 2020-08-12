package com.yedam.oper;

public class BitOperatorExample {
	public static void main(String[] args) {
		int v1 = 10; //1010
		int v2 = ~v1; 
		// ~ n - > 비트를 바꿈
		
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		
		
		byte b1 = 10;
		byte b2 = 4;
		int b3 = b1 % b2; // 연산자가 들어가면 int형 기준으로 연산을 하기 때문에 byte 타입에 들어갈 수 없음.
		System.out.println(b3);
		
		double result = 10/4.0; // 4로 나눳을때랑 4.0으로 나눴을때 다름 정수타입/실수타입
		System.out.println(result); //2.5의 나머지는 무시
		
		
		
		
		
	}
}
