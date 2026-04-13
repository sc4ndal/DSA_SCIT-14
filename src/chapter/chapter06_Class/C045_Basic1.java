package chapter.chapter06_Class;

/*
	클래스(class) : 변수 + 메서드를 하나로 묶어서 만든 사용자 정의 타입
	객체(object) : 메모리에 생성된 모든 대상
	인스턴스(instance) : 특정 클래스를 기반으로 생성된 객체
 */

class Student {
	// 멤버 변수(속성, 상태)
	String name;
	int age;
	
	// 멤버 메서드(기능)
	void introduce() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	void study() {
		System.out.println(name + " 학생이 공부를 합니다.");
	}
	
	void run() {
		System.out.println(name + " 학생이 도망갑니다.");
	}
	
}

public class C045_Basic1 {
	public static void main(String[] args) {
		Student hong = new Student(); // Student 의 인스턴스, 객체
		hong.name = "홍길동";
		hong.age = 20;
		
		Student kim = new Student();
		kim.name = "김이최박";
		kim.age = 28;
		
		hong.introduce();
		hong.study();
		hong.run();
		System.out.println();
		
		kim.introduce();
		kim.study();
		kim.run();
	
	}
}
