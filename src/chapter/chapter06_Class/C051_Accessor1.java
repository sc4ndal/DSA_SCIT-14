package chapter.chapter06_Class;

/*
	접근 지정자(제어자)
	
	accessor 메서드(private 변수에 접근하기 위한 메서드 패턴)
	private 변수는 외부에서 직접 접근할 수 없기 때문에,
	getter / setter 메서드를 통해 접근하도록 한다.
 */

class UserTest {
	// public 변수 (외부 접근 가능)
	public String id = "hong";
	
	// private 변수 (외부 직접 접근 불가능)
	private String pw = "1111";
	
	// getter(값 조회 - 읽기 허용)
	public String getPw() {
		return this.pw;
	}
	
	// setter(값 변경 - 수정 허용)
	public void setPw(String pw) {
		if (pw.length() >= 4) {
			this.pw = pw;
			System.out.println("비밀번호 변경 성공!");
		} else {
			System.out.println("비밀번호는 4자 이상이어야 합니다.");
		}
	}
}

public class C051_Accessor1 {
	public static void main(String[] args) {
		
		UserTest user1 = new UserTest();
		System.out.println(user1.id);
//		System.out.println(user1.pw); // 직접 접근 불가
		
		// getter 사용
		System.out.println("===변정 전===");
		System.out.println("pw : "+user1.getPw());
		
		// setter 사용
		System.out.println("===변경 시도===");
		user1.setPw("123"); // 4자리 이상으로만 변경 가능해서 수정 실패
		user1.setPw("1234");
		System.out.println("===변경 후===");
		System.out.println("pw : "+user1.getPw());
	}
}
