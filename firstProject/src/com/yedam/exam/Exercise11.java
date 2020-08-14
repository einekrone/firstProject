package com.yedam.exam;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run){
			System.out.println("-------------------------------------------");
			System.out.println("1. 학생 수| 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택>");	 
			int selectNo = sc.nextInt();
			
			
			if(selectNo == 1) {
				System.out.print("학생 수>");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for(int i = 0; i<scores.length; i++){
				System.out.print("scores[" + i + "]");
					scores[i] = sc.nextInt();
				}
			}else if(selectNo == 3) {
				for(int i = 0; i<scores.length; i++){
					System.out.println("scores[" + i + "]:" + scores[i]);
				}
			}else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i = 0; i<scores.length; i++) {
					max = (max<scores[i])?scores[i]:max;
//					if(max<scores[i])
//					max = scores[i];
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("최고 점수:" + max );
				System.out.printf("평균 %.2f", avg);
				System.out.println();
			}else if(selectNo == 5){
				run = false;
			}
		
	}System.out.println("프로그램 종료");
}}
