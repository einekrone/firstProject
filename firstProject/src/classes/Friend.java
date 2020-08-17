package classes;

public class Friend {
	String name;
	int age;
	int pnum;

	public Friend() {
		name = "";
		age = 00;
		pnum = 00000000000;
	}

	public Friend(String name, int age, int pnum) {
		this.name = name;
		this.age = age;
		this.pnum = pnum;

	}
	public Friend() {
	}//생성자 오버로딩 뒤에오는 매개값이 다르기 때문에 동일한 이름의 생성자를 사용할 수 있다.
	// public Friend( String n, String p) 가능
	// public Friend( Stirng n, int a, int p) 불가능 매개변수이름만 달라서는 사용 불가능함

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