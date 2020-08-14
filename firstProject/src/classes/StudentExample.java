package classes;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setstuNum(201111);
		s1.setname("김찬호");
		s1.setmajor("경영학");
		
		System.out.println(s1.getstuNum());
		System.out.println(s1.getname());
		System.out.println(s1.getmajor());
		
		
		Student s2 = new Student();
		s2.setstuNum(201112);
		s2.setname("드레이븐");
		s2.setmajor("도끼회전학");
		
		
		Student s3 = new Student();
		s3.setstuNum(201113);
		s3.setname("베인");
		s3.setmajor("덤블링학");
		
		Student s4 = new Student();
		s4.setstuNum(201114);
		s4.setname("이즈리얼");
		s4.setmajor("비전이동학");
		
		Student s5 = new Student(201115, "애쉬","동상학");
	
		Student[] sAry = {s2 , s3, s4};
		System.out.println(s2.stuinfo());
		System.out.println(s3.stuinfo());
		System.out.println(s4.stuinfo());
		
	
	
	String searchName = "이즈리얼";
	String searchMajor = "도끼회전학";
	Student[] sAry1 = {s2, s3, s4, s5};
	for (Student s : sAry1) {
		if(s.getstuNum().equals(searchMajor))
			System.out.println(s.toStirng());
	}
}
}
