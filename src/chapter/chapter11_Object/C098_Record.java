package chapter.chapter11_Object;

/*
	[record]
	- java 16 이상 지원
	- 데이터를 저장하기 위한 간결한 "클래스"
	- DTO (Data Transfer Object)를 만들 때 편리.
	
	특징
	1. 모든 필드는 자동으로 private final
	2. 모든 필드를 받는 생성자 자동 생성
	3. getter 자동 생성(getName()이 아니라 name())
	4. equals(), hashCode(), toString() 자동 생성
	5. 불변 객체
	
	제한
	- 다른 클래스 상속 불가(record는 final)
	- abstract 선언 불가
	- 인터페이스 implements 는 가능
 */

record Member(String name, int memberCode) {
	public Member(int memberCode) {
		this("홍길동",memberCode);
	}
	
	// 일반 메서드 정의 가능
	public void print() {
		System.out.println("회원 : "+name);
	}
	
}

public class C098_Record {
	public static void main(String[] args) {
		Member m1 = new Member("홍길동", 1234);
		
		// toString() 자동 생성
		System.out.println(m1);
		
		// getter 자동 생성
		System.out.println(m1.name());
		System.out.println(m1.memberCode());
		
		// setter 없음(불변 객체)
//		m1.name()="안됨"; // 오류
		
		// 오버로딩 생성자 호출
		Member m2 = new Member(9999);
		System.out.println(m2);
		
		// print()
		m1.print();
	
	}
}
