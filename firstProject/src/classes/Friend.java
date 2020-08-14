package classes;

public class Friend {
	String name;
	int age;
	int pnum;
	
	public Friend(){
		name = "";	
		age = 00;
		pnum = 00000000000;
	}
	public Friend(String name, int age, int pnum) {
		this.name = name;
		this.age =age;
		this.pnum = pnum;
		
}	
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	public int getpnum() {
		return pnum;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setage(int age) {
		this.age = age;
	}
	public void setpnum(int pnum) {
		this.pnum = pnum;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}