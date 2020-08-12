package com.yedam.oper;

public class StriingEqualExample {
	public static void main(String[] args) {
		int v1 = 20;
		int v2 = 30;
		if (v1 == v2) {
		System.out.println("기본 타입일 경우 비교..");
		
		}
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello"); //String 앞에 new 를 붙이면 새로운 주소값을 가진 메소드가 됨
		
		if(str1 == str2) {
			System.out.println("str1, str2는 같은 문자입니다.");
		}
		
		if(str1.equals(str3)) { // ==로 비교하였을때는 new String 는 다르다고 인식하지만, equals 를 사용하면 같다고 인식함.
			System.out.println("str1, str3는 같은 문자입니다.");
		}
		else {
			System.out.println("같은 문자가 아닙니다.");
		}
		
		System.out.println((1 == 1) || (2 == 2));
	}
}
