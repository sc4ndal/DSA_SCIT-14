package chapter.chapter06_Class;

/*
	초기화 블록
	1. static 영역 초기화 블록
	- 클래스가 처음 로딩될 때 한 번만 실행
	2. instance 초기화 블록
	- 객체가 생성될 때마다 실행
	- 생성자 보다 먼저 실행
	
	static -> non static o
	non static -> static x
 */

class ScitCenter {
	// int num; => 기본값
	// int num = 100; => 명시적 초기화
	// static int num = 100;
	/*
		초기화 순서
		1. 클래스변수 : 기본값 -> 명시적 초기화 -> 클래스 초기화 블록
		2. instance 변수 : 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블록 -> 생성자
		
		int, double, float .. = 0, boolean = false, 참조형 = null 이 기본값
		
	 */
	
	// 클래스 변수(정적 변수) : 모든 객체가 공유
	static int totalClass;
	static String courseName;
	
	// 인스턴트 변수 : 각 객체가 가지는 값
	int classNumber;
	
	// static 초기화 블록
	static {
		courseName = "SCIT MASTER";
		System.out.println("교육과정 초기화 완료");
//		classNumber = 10; //error -> classNumber 변수는 static 영역이 아님
	}
	
	// instance 초기화 블록
	{
		totalClass++;
		classNumber = 11 + totalClass;
		System.out.println("신규 기수 개설 준비");
	}
	
	// 생성자
	ScitCenter() {
		System.out.println(classNumber + "기 과정 개설 완료");
	}
//	ScitCenter(int a, int b) {
//
//	}
}

public class C050_Constructor4 {
	public static void main(String[] args) {
		ScitCenter scit1 = new ScitCenter();
		ScitCenter scit2 = new ScitCenter();
		ScitCenter scit3 = new ScitCenter();
		System.out.println();
		System.out.println("1기수 : "+scit1.classNumber+"기"); // -> 인스턴스 생성해야 가능
		System.out.println("2기수 : "+scit2.classNumber+"기");
		System.out.println("3기수 : "+scit3.classNumber+"기");
		
		System.out.println("과정명 : "+ScitCenter.courseName); // -> 인스턴스 없어도 static에 먼저 생성돼서 가능
		System.out.println("총 개설된 기수 : " + ScitCenter.totalClass);
		
		System.out.println(scit1.totalClass); // 인스턴스 객체로 클래스 내 static 변수 부를 수는 있음
		System.out.println(scit1.courseName);
	}
}
