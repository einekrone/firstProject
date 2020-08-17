package classes.inherit;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child("홍길동",15,10);
		child.getName();
		child.getAge();
//		child.getGrade();
		
		Parent parent = new Child("김유신",20, 20);
		parent.getName();
		parent.getAge();
		//parent.getGrade(); // 자식..꺼라서 부모클래스는 못씀		
		
		Vehicle v1 = new Taxi();
	    v1.run();
		v1 = new Bus();
		v1.run();
		
		
		Driver driver = new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());
	
		Parent parent1 =new Parent();
		System.out.println(parent1.toString());
	
	}
}
