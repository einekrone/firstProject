package com.yedam.exam;

public class Exercise04 {
	public static void main(String[] args) {
		boolean dice = true;
		int a = (int) (Math.random() * 6)+1;
		int b = (int) (Math.random() * 6)+1;
		while (dice) {
		if ((a + b) != 5) {
			System.out.println( "합이 5가 아닙니다(" + a + "),(" + b +")");
			dice = false;
		}else {
			System.out.println("합이 5입니다 ("+ a + "),(" + b + ")");
			dice = false;
		}
	}
}
}