package classes;

import java.util.Scanner;

public class FriendExample {
	private static Friend f2;
	private static Friend f1;

	public static void main(String[] args) {
		boolean info = true;
		String a = null;
		int b = 0;
		int c = 0;
		Scanner sc = new Scanner(System.in);

		 
		while(info) {
			System.out.println("----------------------------------------------");
			System.out.println("1.정보입력 | 2. 정보 리스트 | 3. 조회  | 4. 수정| 9. 종료");
			System.out.println("----------------------------------------------");
			System.out.printf("선택 : ");
			int sno = sc.nextInt();
			
			if(sno == 1) {
				Friend  f1 = new Friend(a, b, c);
				System.out.println("이름을 입력하세요 :");
				a = sc.nextLine();
				a = sc.nextLine();
				System.out.print("나이를 입력하세요");
				b = sc.nextInt();
				System.out.print("전화번호를 입력하세요");
				c = sc.nextInt();
				
				System.out.println("------------------");
				System.out.println("정보가 입력되었습니다.");
				
				System.out.println("두 번째 정보를 입력하세요");
				System.out.println("------------------");
				Friend  f2 = new Friend(a, b, c);
				System.out.println("이름을 입력하세요 :");
				a = sc.nextLine();
				a = sc.nextLine();
				System.out.print("나이를 입력하세요");
				b = sc.nextInt();
				System.out.print("전화번호를 입력하세요");
				c = sc.nextInt();
			}else if(sno == 2) {
				System.out.println("이름 :" + a);
				System.out.println("나이 :" + b);
				System.out.println("전화번호 :" + c );
			}else if(sno == 3) {
				String scna = "a";
				System.out.println("조회할 사람의 이름을 입력하세요");
				a = sc.nextLine();
				a = sc.nextLine();
				Friend[] fAry = {f1, f2};
				for (Friend q : fAry) {
						System.out.println(a);
						
				}
			
			}else if(sno == 9) {
				info = false;
			}else {}
	
		}
		System.out.println("프로그램 종료");	
		
	}
}
