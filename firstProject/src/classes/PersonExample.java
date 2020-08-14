package classes;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.setName("김찬호");
//		p1.setAge(28);

//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());

		Person cjy = new Person();
		cjy.setName("최재영");
		cjy.setAge(25);
//		System.out.println(cjy);

		Person ksm = new Person();
		ksm.setName("김상민");
		ksm.setAge(26);
//		System.out.println(ksm);
		
		
		Person ksm2 = new Person();
		ksm2.setName("김상민");
		ksm2.setAge(26);
//		System.out.println(ksm2);

		System.out.println(ksm == ksm2);// 같은 값을 넣어도 다른 주소값을 가지고있음. // 숫자값을 비교할때는 == 사용
		System.out.println(ksm.getName().equals(ksm2.getName())); // 문자를 비교할려면 equals 를 사용


		Person[] pAry = { cjy, ksm, ksm2 };
//		for (int i = 0; i < pAry.length; i++) {
//			pAry[i].introduce();
			System.out.println(ksm.introduce());
			System.out.println(cjy.introduce());
			
			
//			Person anoy = new Person("민해주");
//			anoy.name = "최형준"; // 
//			anoy.age = 28;
//			System.out.println(anoy.introduce()); //생성자를 넣지 않으면 기본값이 없는것
//			
//			Person hsj = new Person("허성준", 20);
//			hsj.setName("김시무"); //바꿀 수도 있음.
//			System.out.println(hsj.introduce());
			
			
		}

	}
