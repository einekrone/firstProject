package com.yedam.ref;

import java.util.Scanner;

public class AdvancedFroExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] scores = new int[5];

		for (int i = 0; i < scores.length; i++) {
			System.out.println("점수를 입력하세요.");
			scores[i] = scn.nextInt();
		}
		int sum = 0;
		double avg = 0;

		for (int num : scores) {
			sum += num;
		}
          
		avg = (double) sum / scores.length;
		System.out.println("합계점수" + sum + ", 평균 :" + avg);
	}
}
