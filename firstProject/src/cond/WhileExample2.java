package cond;

public class WhileExample2 {
	public static void main(String[] args) throws Exception {

		boolean run = true;
		int num = 10;
		int keyCode = 0;
		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("키를 누르세요");
				keyCode = System.in.read();
				if (keyCode != 13)
					System.out.println(keyCode);

			}
			System.in.read();
			System.in.read();
			// keyCode = System.in.read();
			// System.out.println(keyCode);
			if (keyCode == 57)
				run = false;
		}

//			System.out.println("num:" + num);
//			if (num -- == 0)
//				run = false; //break;
//		}
//	}

		System.out.println("프로그램 종료.");
	}
}