package com.yedam.test;

import java.util.Scanner;

public class lunch1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		System.out.println("숫자를 입력하세요");
		a = sc.nextInt();
		System.out.println("숫자를 입력하세요");
		b = sc.nextInt();
		System.out.println("숫자를 입력하세요");
		c = sc.nextInt();

		if (a < b && b < c) {
			System.out.println(a + b + c);
		} else if (a < b && c < a) {
			System.out.println("잘못된 순서입니다." + c + "," + a + "," + b);
		} else if (a < c && c < b) {
			System.out.println("잘못된 순서입니다." + a + "," + c + "," + b); 
		} else if (c < a && b < a) {
			System.out.println("잘못된 순서입니다." + c + "," + b + "," + a);
		} else if (a < b && b < c)
			System.out.println("정확한 배열입니다." + a + "," + b + "," + c);
	}
}
