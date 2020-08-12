package com.yedam.oper;

public class OverflowExample {
	public static void main(String[] args) {
//		System.out.println(Integer.MIN_VALUE);
		
		int result = safeAdd(2147483647,10);
		System.out.println(result);
	}
	
	public static int safeAdd(int a , int b) {
			int sum = 0;
			if(Integer.MAX_VALUE - b < a) {
			System.out.println("유효값이 아닙니다.");
			sum = 0;
		
	}
		else if (Integer.MIN_VALUE - b > a) {
			System.out.println("유효값이 아닙니다2.");
			sum = 0;
	}
		
		else {
			sum = a + b;
	}
		return sum;
	}
}
