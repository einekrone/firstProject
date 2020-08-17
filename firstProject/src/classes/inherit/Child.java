package classes.inherit;

public class Child extends Parent {
	private int grade;
	
	public Child(String name, int age) {
		super(name, age); //부모클래스의 생성자를 상속받아서 옴
	} 
	
	public Child(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	
	
}
