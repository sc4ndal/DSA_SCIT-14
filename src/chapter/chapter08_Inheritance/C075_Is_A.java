package chapter.chapter08_Inheritance;

/*
	[IS-A 관계]
	상속 관계를 설명할 때 사용하는 개념
	자식 클래스는 부모 클래스의 한 종류이다.
 */
class Animal {
	void move() {
		System.out.println("동물이 움직입니다.");
	}
	void cring() {
	
	}
}

class Person extends Animal {
	@Override
	void move() {
		System.out.println("사람이 걷습니다.");
	}
	@Override
	void cring() {
		System.out.println("따흑");
	}
}

public class C075_Is_A {
	public static void main(String[] args) {
		Animal a = new Animal(); // 동물은 동물이다.
		Person h = new Person(); // 사람은 사람이다.
		Animal ah = new Person(); // 사람은 동물이다.
//		Person ha = new Animal(); // 동물은 사람이다. -> 오류
		
		a.cring();
		h.cring();
		ah.cring();
		
		a.move();
		h.move();
		ah.move();
		
	}
	
}
