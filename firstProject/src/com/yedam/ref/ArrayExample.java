package com.yedam.ref;

public class ArrayExample {
	public static void main(String[] args) {
		int score1 = 10, score2 = 20, score3 = 30, score4 = 40;
		score2 = 50;
		int sum = score1 + score2 + score3 + score4;

		int[] intAry = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		// sum = intAry[0] + intAry[1] + intAry[2] + intAry[3];
		intAry[1] = 50;

		sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
			sum = sum + intAry[i];
		}
		System.out.println("sum :" + sum);

		double[] dAry = { 2.3, 4.3 };

		String[] sAry = { "Hello", "wordl", "nice", "good" };
		for (int c = 0; c < sAry.length; c++) {
			System.out.println(sAry[c]);
		}
		String[] scoreAry = new String[5];
		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		}
		scoreAry[0] = "one";
		scoreAry[1] = "two";
		scoreAry[2] = "three";
	}
//		int[] mathAry
//		mathAry=new int[]{1,2,3,4,5,6,7,8,9};
//		
//		

}
