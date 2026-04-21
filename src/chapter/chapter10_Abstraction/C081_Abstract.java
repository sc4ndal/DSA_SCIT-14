package chapter.chapter10_Abstraction;

/*
	[추상 클래스] - abstract
	구조
		- 멤버 변수
		- 생성자
		- 일반 메서드
		- 추상 메서드
		
	특징
		1. 클래스 앞에 abstract 예약어 붙임
		2. 추상 메서드(구현부가 없는 메서드)를 가질 수 있다.
		3. 추상 클래스는 객체를 직접 생성할 수 없다.
		4. 상속을 통해서만 사용 가능
		5. 하위 클래스는 추상 메서드를 반드시 오버라이딩 해야한다.
		(오버라이딩 하지 않으면 하위 클래스도 abstract가 되어야 한다.)
 */

abstract class Animal {
		// 멤버 변수
	String name;
	
	// 생성자
	Animal(String name) {
		this.name = name;
	}
	
	// 일반 메서드
	void alive() {
		System.out.println(name + " 은(는) 생물입니다.");
	}
	
	// 추상 메서드
	abstract void move();
}

class Human extends Animal {
	public Human(String name) {
		super(name);
	}
	
	@Override
	void move() {
		System.out.println(name+" 이(가) 두 발로 걷습니다.");
	}
	void run() {
		System.out.println(name+" 이(가) 매우 빠르게 도망갑니다.");
	}
}

class Tiger extends Animal {
	public Tiger(String name) {
		super(name);
	}
	
	@Override
	void move() {
		System.out.println(name+" 은(는) 네 발로 뜁니다.");
	}
	void hunt() {
		System.out.println(name+" 은(는) 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public Eagle(String name) {
		super(name);
	}
	
	@Override
	void move() {
		System.out.println(name+" 은(는) 날아갑니다.");
	}
	void hunt() {
		System.out.println(name+" 은(는) 사냥을 합니다.");
	}
}

public class C081_Abstract {
	public static void main(String[] args) {
		
		Animal a = new Human("사람");
		Animal b = new Tiger("호랭이");
		Animal c = new Eagle("독수리부엉이");
		a.alive();
		b.alive();
		c.alive();
		System.out.println();
		
		
		Human h1 = new Human("홍길동");
		h1.alive();
		h1.move();
		h1.run();
		System.out.println();
		
		Tiger ti = new Tiger("호랑이");
		ti.move();
		ti.hunt();
		System.out.println();
		
		Eagle ea = new Eagle("독수리");
		ea.move();
		ea.hunt();
		
	}
}
