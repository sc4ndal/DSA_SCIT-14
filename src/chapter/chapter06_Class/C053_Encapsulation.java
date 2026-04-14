package chapter.chapter06_Class;

/*
	[캡술화(encapsulation)]
	멤버변수는 private 으로 외부 접근을 막고
	getter / setter 메서드를 통해서만 접근하도록 한다.
 */

class Member {
	private String id;
	private String password;
	private String phoneNumber;
	
	public Member(String id, String password, String phoneNumber) {
		this.id = id;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	
	// id는 변경불가(읽기 전용)
	public String getId() {
		return id;
	}
	
	// pw는 조회불가, 변경 가능
	public void setPassword(String password) {
		this.password = password;
	}
	
	// 전화번호는 조회&변경 가능
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// 회원 정보 출력
	public void showInfo() {
		System.out.println("[회원 정보]");
		System.out.println("아이디 : " + id);
		System.out.println("전화번호 : "+phoneNumber);
	}
	
}
public class C053_Encapsulation {
	public static void main(String[] args) {
		Member m1 = new Member("홍길동", "1111", "01012345678");
		m1.showInfo();
		
		//getter 사용
		System.out.println("아이디 : " + m1.getId());
		System.out.println("전화번호 : " + m1.getPhoneNumber());
		
		//setter 사용
		System.out.println("===전화번호 변경===");
		m1.setPhoneNumber("01011112222");
		m1.showInfo();
	}
}
