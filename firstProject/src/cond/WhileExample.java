package cond;

public class WhileExample {
	public static void main(String[] args) {
//		int i = 0;
//		int sum = 0;
//		while(i<10) {
//			i++;
//		sum = i + sum;
//		}
//		System.out.println(sum);
		int a = 1;
		while (a < 10) {
			int b = 1;
			while (b < 10) {
				System.out.println(b + "*" + a + "=" + (b * a));
				b++;
			}
			a++;
		}

	}
}
