package classes;

public class Student {
	int stuNum;
	String name;
	String major;
	
	public Student() {
		stuNum = 200000;
		name = "";
		major = "";
	}
	public Student(int stuNum, String name) {
		this.stuNum = stuNum;
		this.name = name;
	}
	public Student(int stuNum, String name, String major) {
		this.stuNum = stuNum;
		this.name = name;
		this.major = major;
	}	
	
	public String stuinfo() {
		return " 학번 : " + stuNum + "  " + "이름 : " + name + " " +  " 전공 : " + major;  
	}
	public int getstuNum() {
		return stuNum;
	}
	public String getname() {
		return name;
	}
	public String getmajor() {
		return major;
	}
	public void setstuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setmajor(String major) {
		this.major = major;
	}
	
	
	
	
	
	
	
}
