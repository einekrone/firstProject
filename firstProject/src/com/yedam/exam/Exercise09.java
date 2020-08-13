package com.yedam.exam;

public class Exercise09 {
	public static void main(String[] args) {
		int max = 0;
		int [] ary = { 1,5,3,8,2};
		
		for (int a = 0; a<ary.length; a++) {
			if(max<ary[a]) {
				max = ary[a];
			}
		}
		System.out.println("max:" + max);
	
	}
}
