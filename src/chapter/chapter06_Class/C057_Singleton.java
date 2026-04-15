package chapter.chapter06_Class;

/*
	[싱글턴 패턴(Singleton Pattern)]
	프로그램에서 객체를 단 하나만 생성하도록 제한하는 패턴
	
	장점
	- 객체 생성 비용 절약 -> 메모리 효율 증가
	- 전역 상태 공유
	단점
	- 전역 상태 문제(어디서든 상태 변경 가능)
 */

class Singleton {
	
	// 클래스 내부에서 사용할 단 하나의 객체
	private static Singleton instance;
	
	// 외부에서 new Singleton()을 못 하게 막지
	private Singleton() {
		System.out.println("Singleton 생성자 호출");
	}
	
	// 객체를 반환하는 메서드
	public static Singleton getInstance() {
		// 아직 객체가 없다면 생성
		if (instance == null) {
			instance = new Singleton();
		}
		// 이미 있다면 기존 객체 반환
		return instance;
	}
	
	public void printMethod() {
		System.out.println("싱글턴 객체의 메서드 실행");
	}
}

public class C057_Singleton {
	public static void main(String[] args) {
//		String s = new Singleton(); // Singleton 생성자를 private로 만들어서 못 만듦
		Singleton st1 = Singleton.getInstance();
		st1.printMethod();
		
		Singleton st2 = Singleton.getInstance();
		st2.printMethod();
		
		// 두 객체가 같은 객체인지 비교
		System.out.println("st1=st2? : "+(st1==st2));
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
	}
}
