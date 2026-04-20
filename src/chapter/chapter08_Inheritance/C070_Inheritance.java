package chapter.chapter08_Inheritance;

/*
	[상속]
	상속은 부모가 자식에게 물려주는 행위
	상속은 공통 기능은 재사용하고, 다른 부분만 확장하기 위한 구조
	부모(상위) 클래스의 멤버를 자식(하위) 클래스에 물려주어
	자식 클래스가 갖고 있는 것처럼 사용
 */

// 부모클래스, 상위클래스, 슈퍼클래스
class A {
	public String name;
	private int age;
	
	public void method() {
		System.out.println("부모 메서드 실행");
		System.out.println(name+" 입니다.");
	}
}

// 자식클래스, 하위클래스, 서브클래스
class B extends A { }

public class C070_Inheritance {
	public static void main(String[] args) {
		A a = new A();
		a.name = "유비";
		a.method();
		
		
		B b = new B();
		b.name = "홍길동";
		b.method();
	}
}
