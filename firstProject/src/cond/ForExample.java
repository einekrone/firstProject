package cond;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum += 1;
		System.out.println("최종결과는 " + sum);
		
		
		
	// 위 아래가 같음
		
		
		sum = 0;
		for (int a = -1; a< 3; a++) {
			sum = sum + 1;
		}
		System.out.println("최종결과는 " + sum);
		
		sum+=1;
		
		sum =0;
		for(int a = 3; a>0; a--) {
			sum = sum +1;
			System.out.println("최종결과는 " + sum);	
			
		sum = 0;
		for(int i = 1; i <= 9; i ++) {
			sum = sum +1;
		}
		}
		System.out.println("1 ~ 10 합 :" +  sum);
		int num = 2;
		for (;num<=9; num++)//초기값 위에껄 사용하겠다
		for(int a = 1; a<=9; a++) {
		System.out.println(num + " * " + a + " = " + (num *a));
		}
		
		
		
		
		
		
		
//		System.out.println(num + " * " + 1 + " = " + (num *1));
//		System.out.println(num + " * " + 2 + " = " + (num *2));
//		System.out.println(num + " * " + 3 + " = " + (num *3));
//		System.out.println(num + " * " + 4 + " = " + (num *4));
//		System.out.println(num + " * " + 5 + " = " + (num *5));
//		System.out.println(num + " * " + 6 + " = " + (num *6));
//		System.out.println(num + " * " + 7 + " = " + (num *7));
//		System.out.println(num + " * " + 8 + " = " + (num *8));
//		System.out.println(num + " * " + 9 + " = " + (num *9));
		
		
	}
}
