package classes.statics;

import classes.Person;

public class SingletonExample {
	public static void main(String[] args) {
		// Singleton s1 =new Singleton(); // new로 싱글톤 인스턴스를 만들 수 없음 private로 숨겼음
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) { // class 
			System.out.println("동일한 인스턴스입니다.");
		}else {
			System.out.println("다른 인스턴스입니다.");
		}
	
		Person p1 = new Person();
		p1.setName("1111");
	}
}
