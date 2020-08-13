package com.yedam.exam;

public class Exercise10 {
	public static void main(String[] args) {
		int[][] abc = 
			{ { 95, 86 }, 
			{ 83, 92, 96 }, 
			{ 78, 83, 93, 87, 88 } 
			};
		
		int sum = 0;
		double avg = 0.0;
				
		int a = 0;
		for (int i = 0; i<abc.length; i++){
			for(int j = 0; j<abc[i].length; j++){
				sum += abc[i][j];
			a++;
		}
	}
		avg = (double) sum / a;
		System.out.println("sum:" + sum); 
		System.out.println("avg:" + avg);
	}
}