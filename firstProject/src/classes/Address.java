package classes;

import java.util.Scanner;

public class Address {
	public static void main(String[] args) {

		// 1.정보입력 (이름,나이,전화번호)
		// 2.리스트
		// (3).이름조회
		// (4).이름조회 후 수정
		// 9. 종료

		Friend[] Friends = new Friend[100];
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		// 메뉴출력.

		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1. 정보입력 (이름,나이,전화번호) 2. 리스트 9. 종료");
			System.out.println("----------------------------------------");
			System.out.println("선택>");
			int selectNo = scan.nextInt();scan.nextLine(); // nextLine는 여기 한번 더 써줌
			if (selectNo == 1) {
				System.out.print("이름입력>");
				String name = scan.nextLine();
				System.out.print("나이입력>");
				int age = scan.nextInt();
				System.out.print("전화번호입력>");
				int pnum = scan.nextInt();
				Friend f = new Friend(name,age,pnum);
				
				//한건만입력해야함
				for(int i =0; i<Friends.length; i++) {
					if(Friends[i] == null) {
						Friends[i] = f;
						break; // for 반복문 탈출.
					}
				}
				
			} else if (selectNo == 2) {
				for(Friend frnd : Friends) {
					if(frnd != null) {
						System.out.println("이름:" + frnd.getname()
						+", 나이:" + frnd.getage() + ", 전화번호:" + frnd.getpnum());
						
					}
				}
			} else if (selectNo == 9) {

			}


		} 
		System.out.println("프로그램 종료.");

	}
}
