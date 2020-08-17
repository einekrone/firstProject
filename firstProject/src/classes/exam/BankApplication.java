package classes.exam;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택하세요>");
			
			int sltNo =sc.nextInt();sc.nextLine();
			if (sltNo == 1)
				createAccount();
			else if(sltNo == 2) {
				accountList();
			}else if(sltNo == 3) {
				deposit();
			}else if(sltNo == 4) {
				withdraw();
			}else if(sltNo == 5) {
				run = false;
			}
			}
			System.out.println("프로그램 종료");
		
			}

	// 계좌 생성하기
	private static void createAccount() {
			System.out.println("------");
			System.out.println("계좌생성");
			System.out.println("------");
			System.out.println("계좌번호>");
			String ano = sc.nextLine();
			System.out.println("계좌주>");
			String owner = sc.nextLine();
			System.out.println("초기입금액>");
			int balance = sc.nextInt();
			System.out.println("----------------");
			System.out.println("계좌가 생성되었습니다.");
			System.out.println("----------------");
			
			Account a = new Account(ano,owner,balance);
			
			for(int i = 0; i<accountArray.length; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = a;
					break;
				}
			}
		}

	// 계좌 목록보기
	private static void accountList() {
			for(Account aAry : accountArray) {
				if(aAry != null) {
					System.out.println("계좌번호 :" + aAry.getAno()
					+ ", 계좌주 : "+ aAry.getOwner() 
					+ ", 잔액 : " + aAry.getBalance());
				}	
			}
		}
	
	
	//예금하기
	private static void deposit() {
		System.out.println("-----");
		System.out.println(" 예금 ");
		System.out.println("-----");
	
		int balance = 0;
		int input = 0;
		int output = 0;
		
		boolean result = false;
		for (int i = 0; i<accountArray.length; i++) {
			if((accountArray[i].getAno().equals(sc.nextLine())){
				result = true;
				break;
				System.out.println("계좌번호 : " + accountArray[i].getAno());
				System.out.println("예금액 : " + accountArray[i].getBalance());
				input = sc.nextInt();
				balance = balance + input;
			}else 
			result =false;
			System.out.println();
		}
		return reslut;


		

	private static void withdraw() {
		System.out.println("-----");
		System.out.println(" 출금 ");
		System.out.println("-----");
		
		

		boolean result = false;
		for (int i = 0; i<accountArray.length; i++) {
			if(accountArray[i].getAno().equals(sc.nextLine())){
				result = true;
				break;
				System.out.println("계좌번호 : " + accountArray[i].getAno());
				System.out.println("예금액 : " + accountArray[i].getBalance());
				input = sc.nextInt();
				balance = balance + input;
		
		
			}	
	}
		
		
	
		}
		
	private static Account findAccount(String ano) {
		for (int i = 0; i<accountArray.length; i++) {
			ifif(accountArray[i] != null && accoountArray[i].getano().equals
		}
	}
