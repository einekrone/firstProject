package classes;

public class Person {
	
	//필드
	String name;
	int age;
	//생성자
	public Person() { //매개값이 생성자를 기본생성자(default constructor)라고 한다.
		name = "anonymous";
		age = 10;
	}	
		public Person(String name) {
			this.name = name;   //클래스 이름과 같은것으로 기능을 담는것은 생성자, 리턴값이 없음
	}
		public Person(String name, int age) {
			this.name = name;   
			this.age  = age;
		}
	//메소드
	public String introduce() {
		return "이름은" + " "+ name +" " +  "나이는" + " " + age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
