package chapter.chapter11_Object;

/*
	[toString()]
	Object 클래스의 toString() 메서드
	객체의 정보를 문자열 형태로 반환하는 메서드
	
	구조
		클래스이름 @ 해시코드
		ex.ex. Human@5e91993f
		
	* 필요에 따라 객체의 정보를 보기 쉽게 출력하기 위해
	toString()를 오버라이딩해 사용한다.
 */

public class C086_ToString {
	public static void main(String[] args) {
		
		// 기본형 데이터
		int i = 12345;
		System.out.println(i);
		
		// 객체
		Human hong = new Human(29, "홍길동");
		System.out.println("=== 객체 멤버 출력 ===");
		System.out.println(hong.age);
		System.out.println(hong.name);
		// 객체 출력
		System.out.println(hong);				// 동일
		System.out.println(hong.toString());	// 동일
	}
}
