package com.yedam.dev;

public class MorningCode {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String name = "김찬호";
		System.out.println(str1 + '\t' + name);
		
		int v1 = 150, v2 = 270;
		int result = add(v1, v2);
		System.out.println("결과값:" + result);
		
		introduce("홍길동");
		
		result = minus(v1, v2);
		System.out.println("결과는" + result);
		}
		
		public static int minus(int v1 , int v2){
			int aa = v1 - v2;
			return  aa;
			
		}
		
		public static void introduce(String name) {
			System.out.println("안녕하세요. 저는 "+ name +" 입니다.");
		} // 결과값을 반환해주지 않아서 호출을 하지 않으면 반환되지 않음.
	
	
		public static int add(int x, int y) {
			int sum = x + y;
			return sum;
		}
}
