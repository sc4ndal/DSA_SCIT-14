package chapter.chapter08_Inheritance;

/*
	[super]
	1. super(...)
		부모 클래스의 생성자를 호출할 때 사용
	2. super.멤버
		부모 클래스의 변수나 메서드에 접근할 때 사용
		
	* 자식 생성자에서는 부모 생성자가 먼저 실행된다.
 */

class Human {
	int age;
	String name;
	
	public Human(int age, String name) {
		System.out.println("Human 생성자 실행");
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("=== 부모 메서드 실행 ===");
		System.out.println(age + "살, " + name + "입니다.");
	}
	
}

class Student extends Human {
	int stnum;
	
	public Student(int age, String name, int stnum) {
		super(age, name);
		System.out.println("Student 생성자 실행");
		this.stnum = stnum;
		
	}
	void study() {
		System.out.println("=== 자식 메서드 실행 ===");
		System.out.println(super.age + "살, " + super.name + "입니다.");
		System.out.println(name+"의 학번은 "+this.stnum+"입니다.");
	}
	
}
public class C071_Super {
	public static void main(String[] args) {
		Student st1 = new Student(20, "홍길동", 20260420);
		System.out.println();
		st1.intro();
		st1.study();
	}
}
