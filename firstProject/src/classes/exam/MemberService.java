package classes.exam;

public class MemberService {

	public boolean login(String id, String password) { //Member[] ms

		// db 역할
		Member[] members = new Member[3]; //db역할을 하는 배열을 필드에 선언할수도 있음.

		members[0] = new Member("홍길동", "hong");
		members[0].setPassword("hong123");

		members[1] = new Member("김유신", "kim");
		members[1].setPassword("kim123");

		members[2] = new Member("최재영", "choi");
		members[2].setPassword("choi123");

		boolean result = false;
		for (int i = 0; i < members.length; i++) {
			if (id.equals(members[i].getId()) && 
					password.equals(members[i].getPassword())) {
				result = true;
				break;
			} else
				result = false;
		}
		return result;
	}

	public void logout() {
		System.out.println("로그아웃 되었습니다.");
	}

}
